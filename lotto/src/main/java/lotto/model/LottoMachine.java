package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.common.Constants;

import java.util.ArrayList;
import java.util.List;

public class LottoMachine {

    public Lottos generateLottos(int tickets) {
        List<Lotto> lottos = new ArrayList<>(tickets);
        for (int i = 0; i < tickets; i++) {
            lottos.add(generateLotto());
        }
        return new Lottos(lottos);
    }

    private Lotto generateLotto() {
        return new Lotto(Randoms.pickUniqueNumbersInRange(
                Constants.LOTTO_BOUND_START,
                Constants.LOTTO_BOUND_END,
                Constants.LOTTO_NUMBERS_COUNT));
    }
}
