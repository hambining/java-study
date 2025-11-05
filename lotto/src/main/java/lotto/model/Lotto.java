package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.common.Constants;
import lotto.common.Validation;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        Validation.validateSize(numbers);
        this.numbers = numbers;
    }

    // Lotto 생성
    public static Lotto generateLotto() {
        return new Lotto(Randoms.pickUniqueNumbersInRange(Constants.LOTTO_BOUND_START, Constants.LOTTO_BOUND_END, Constants.LOTTO_NUMBERS_COUNT));
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
