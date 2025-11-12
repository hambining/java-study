package lotto.model;

import lotto.common.Validation;

import java.util.List;

public class BonusNumber {
    private final int bonusNumber;

    public BonusNumber(int bonusNumber, List<Integer> winningNumbers) {
        Validation.validateBonusNumber(bonusNumber, winningNumbers);
        this.bonusNumber = bonusNumber;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
