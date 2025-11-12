package lotto.controller;

import lotto.common.InputReader;
import lotto.model.*;
import lotto.model.service.LottoService;
import lotto.view.ErrorMessages;
import lotto.view.Messages;
import lotto.view.UserInput;

import java.util.Map;

public class LottoController {

    private final UserInput userInput;
    private final LottoService lottoService;

    public LottoController() {
        this.userInput = new UserInput();
        this.lottoService = new LottoService();

    }

    public void run() {

        // 구매 횟수 출력
        int tickets = repeatUntilValid(() -> {
            int money = userInput.readMoney();
            return lottoService.getTickets(money);
        });
        Messages.TICKETS.printf(tickets);

        // 로또 번호 출력
        Lottos lottos = lottoService.buyLotto(tickets);
        lottos.getLottos().forEach(lotto -> Messages.LOTTO.println(lotto.getNumbers()));

        // 당첨 번호
        WinningNumbers winningNumbers = repeatUntilValid(
                () -> new WinningNumbers(userInput.readWinningNumbers())
        );

        // 보너스 번호
        BonusNumber bonusNumber = repeatUntilValid(
                () -> new BonusNumber(userInput.readBonusNumber(), winningNumbers.getNumbers())
        );

        // 결과 불러오기
        Result result = lottoService.getResult(lottos, winningNumbers, bonusNumber.getBonusNumber());

        // 결과 출력
        Messages.RESULT.println();
        for (Map.Entry<Rank, Integer> entry : result.getResults().entrySet()) {
            Rank rank = entry.getKey();
            int count = entry.getValue();

            printRank(rank, count);
        }

        // 수익률 계산 후 출력
        double rateOfReturn = lottoService.getRateOfReturn(tickets, result);
        Messages.RATE_OF_RETURN.printf(rateOfReturn);

    }

    private <T> T repeatUntilValid(InputReader<T> reader) {
        while (true) {
            try {
                return reader.read();
            } catch (IllegalArgumentException e) {
                ErrorMessages.println(e.getMessage());
            }
        }
    }

    private void printRank(Rank rank, int count) {
        if (rank == Rank.NONE) return;
        if (rank == Rank.SECOND) {
            Messages.RESULT_WITH_BONUS_NUMBER.printf(rank.getHits(), rank.getPrize(), count);
            return;
        }
        Messages.RESULT_DETAIL.printf(rank.getHits(), rank.getPrize(), count);
    }
}
