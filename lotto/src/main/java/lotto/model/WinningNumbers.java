package lotto.model;

import lotto.common.Validation;

import java.util.List;

public class WinningNumbers {
    private final List<Integer> numbers;

    public WinningNumbers(List<Integer> numbers) {
        Validation.validateSize(numbers);
        Validation.validateDuplicateNumbers(numbers);
        Validation.validateNumberRange(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
