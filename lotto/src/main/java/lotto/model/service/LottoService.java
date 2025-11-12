package lotto.model.service;

import lotto.common.Validation;
import lotto.model.*;
import lotto.model.Rank;

import java.util.List;

import static lotto.common.Constants.*;

public class LottoService {

    private final Store store;
    private final LottoMachine lottoMachine;

    public LottoService(Store store, LottoMachine lottoMachine) {
        this.store = store;
        this.lottoMachine = lottoMachine;
    }

    // 등수를 바탕으로 결과 return
    public Lottos buyLottos(int money) {
        int ticket = store.calculateTickets(money);
        return lottoMachine.generateLottos(ticket);
    }

    public Result getResult(Lottos lottos, WinningNumbers winningNumbers, int bonusNumber) {
        Result result = new Result();

        lottos.getLottos().stream()
                .map(lotto -> {
                    int hits = winningNumbers.countHits(lotto);
                    boolean hasBonusNumber = lotto.getNumbers().contains(bonusNumber);
                    return Rank.getRank(hits, hasBonusNumber);
                })
                .forEach(result::addResult);

        return result;
    }

    public double getRateOfReturn(int tickets, Result result) {
        int money = tickets * TICKET_PRICE;
        int sumOfPrize = result.getResults().entrySet().stream()
                .mapToInt(entry -> entry.getKey().getPrize() * entry.getValue())
                .sum(); // 상금 합계
        return ((double) (sumOfPrize - money) / money) * 100;
    }
}
