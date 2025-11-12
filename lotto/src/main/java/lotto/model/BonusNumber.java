package lotto.model;

import java.util.List;

import static lotto.view.ErrorMessages.DUPLICATED_BONUS_NUMBER;

public class BonusNumber {
    private final int bonusNumber;

    public BonusNumber(int bonusNumber, List<Integer> winningNumbers) {
        validateBonusNumber(bonusNumber, winningNumbers);
        this.bonusNumber = bonusNumber;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    private void validateBonusNumber(int bonusNumber, List<Integer> numbers) {
        if (numbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(DUPLICATED_BONUS_NUMBER.getMessage());
        }
    }

}
