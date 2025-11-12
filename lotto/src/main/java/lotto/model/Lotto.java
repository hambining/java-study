package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.common.Constants;
import java.util.List;

public class Lotto extends AbstractNumbers {
    public Lotto(List<Integer> numbers) {
        super(numbers);
    }

    // Lotto 생성
    public static Lotto generateLotto() {
        return new Lotto(Randoms.pickUniqueNumbersInRange(Constants.LOTTO_BOUND_START, Constants.LOTTO_BOUND_END, Constants.LOTTO_NUMBERS_COUNT));
    }
}
