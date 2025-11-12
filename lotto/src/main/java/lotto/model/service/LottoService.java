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

        for (Lotto lotto : lottos.getLottos()) {
            int hits = getHits(lotto.getNumbers(), winningNumbers.getNumbers());  // 맞은 개수 계산
            boolean hasBonusNumber = lotto.getNumbers().contains(bonusNumber);      // 보너스 번호 여부 계산
            result.addResult(rank);                                                 // 결과 반환
        }
                    return Rank.getRank(hits, hasBonusNumber);

        return result;

    }

    // 로또 번호 일치 개수 반환
    private int getHits(List<Integer> lotto, List<Integer> winningNumbers) {
        int hits = 0;
        for (Integer lottoNumber : lotto) {
            if (winningNumbers.contains(lottoNumber)) {
                hits++;
            }
        }
        return hits;
    // 수익률 계산
    public double getRateOfReturn(int tickets, Result result) {
        int money = tickets * TICKET_PRICE;
        int sumOfPrize = result.getResults().entrySet().stream()
                .mapToInt(entry -> entry.getKey().getPrize() * entry.getValue())
                .sum(); // 상금 합계
        return ((double) (sumOfPrize - money) / money) * 100;
    }
}
