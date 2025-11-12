package lotto.controller;

import lotto.model.*;
import lotto.model.service.LottoService;
import lotto.view.LottoPrinter;
import lotto.view.UserInput;

public class LottoController {

    private final UserInput userInput;
    private final LottoPrinter lottoPrinter;
    private final LottoService lottoService;

    public LottoController() {
        this.userInput = new UserInput();
        lottoPrinter = new LottoPrinter();
        Store store = new Store();
        LottoMachine lottoMachine = new LottoMachine();
        this.lottoService = new LottoService(store, lottoMachine);
    }

    public void run() {
        Lottos lottos = purchaseLotto();

        WinningNumbers winningNumbers = inputWinningNumbers();

        BonusNumber bonusNumber = inputBonusNumber(winningNumbers);

        showResult(lottos, winningNumbers, bonusNumber);
    }

    private Lottos purchaseLotto() {
        int money = userInput.repeatUntilValid(userInput::readMoney);
        Lottos lottos = lottoService.buyLottos(money);
        lottoPrinter.printLottoTickets(lottos.getLottos().size());
        lottoPrinter.printLottos(lottos);
        return lottos;
    }

    private WinningNumbers inputWinningNumbers() {
        return userInput.repeatUntilValid(
                () -> lottoService.setWinningNumbers(userInput.readWinningNumbers()));
    }

    private BonusNumber inputBonusNumber(WinningNumbers winningNumbers) {
        return userInput.repeatUntilValid(
                () -> lottoService.setBonusNumber(userInput.readBonusNumber(), winningNumbers)
        );
    }

    private void showResult(Lottos lottos, WinningNumbers winningNumbers, BonusNumber bonusNumber) {
        Result result = lottoService.getResult(lottos, winningNumbers, bonusNumber.getBonusNumber());
        lottoPrinter.printResult(result);

        double rateOfReturn = lottoService.getRateOfReturn(lottos.getLottos().size(), result);
        lottoPrinter.printRateOfReturn(rateOfReturn);
    }
}
