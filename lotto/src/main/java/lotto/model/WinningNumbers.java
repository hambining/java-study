package lotto.model;

import lotto.common.Validation;

import java.util.List;

public class WinningNumbers {
    private final List<Integer> numbers;
public class WinningNumbers extends AbstractNumbers {

    public WinningNumbers(List<Integer> numbers) {
        Validation.validateDuplicateNumbers(numbers);
        Validation.validateNumberRange(numbers);
        super(numbers);
    }

    }
}
