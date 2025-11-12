package lotto.model;

import java.util.List;

import static lotto.common.Constants.*;
import static lotto.view.ErrorMessages.*;

public abstract class AbstractNumbers {
    private final List<Integer> numbers;

    public AbstractNumbers(List<Integer> numbers) {
        validateSize(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static void validateSize(List<Integer> numbers) {
        if (numbers.size() != LOTTO_NUMBERS_COUNT) {
            throw new IllegalArgumentException(INVALID_SIZE.getMessage());
        }
    }
}
