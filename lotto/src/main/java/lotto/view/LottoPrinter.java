package lotto.view;

import lotto.model.Lottos;
import lotto.model.Rank;
import lotto.model.Result;

public class LottoPrinter {

    public void printMessage(Messages message) {
        System.out.println(message.getMessage());
    }

    public void printLottoTickets(int tickets) {
        System.out.printf(Messages.TICKETS.getMessage(), tickets);
        System.out.println();
    }

    public void printLottos(Lottos lottos) {
        lottos.getLottos().forEach(lotto ->
                System.out.println(lotto.getNumbers()));
    }

    public void printResult(Result result) {
        System.out.println(Messages.RESULT.getMessage());
        result.getResults().forEach((rank, count) -> {
            if (rank == Rank.SECOND) {
                System.out.printf(Messages.RESULT_WITH_BONUS_NUMBER.getMessage(),
                        rank.getHits(), rank.getPrize(), count);
                System.out.println();
                return;
            }
            System.out.printf(Messages.RESULT_DETAIL.getMessage(),
                    rank.getHits(), rank.getPrize(), count);
            System.out.println();
        });
    }

    public void printRateOfReturn(double rate) {
        System.out.printf(Messages.RATE_OF_RETURN.getMessage(), rate);
        System.out.println();
    }
}
