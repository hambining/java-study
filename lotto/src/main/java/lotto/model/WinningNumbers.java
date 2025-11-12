package lotto.model;

import java.util.List;

import static lotto.common.Constants.LOTTO_BOUND_END;
import static lotto.common.Constants.LOTTO_BOUND_START;
import static lotto.view.ErrorMessages.DUPLICATED_NUMBERS;
import static lotto.view.ErrorMessages.INVALID_RANGE;

public class WinningNumbers extends AbstractNumbers {

    public WinningNumbers(List<Integer> numbers) {
        super(numbers);
        validateNumberRange(numbers);
        validateDuplicateNumbers(numbers);
    }

    public int countHits(Lotto lotto) {
        return (int) lotto.getNumbers().stream()
                .filter(this.getNumbers()::contains)
                .count();
    }

    private void validateNumberRange(List<Integer> numbers) {
        if (numbers.stream().anyMatch(num -> num < LOTTO_BOUND_START || num > LOTTO_BOUND_END)) {
            throw new IllegalArgumentException(INVALID_RANGE.getMessage());
        }
    }

    private void validateDuplicateNumbers(List<Integer> numbers) {
        if (numbers.size() != numbers.stream().distinct().count()) {
            throw new IllegalArgumentException(DUPLICATED_NUMBERS.getMessage());
        }
    }

}
