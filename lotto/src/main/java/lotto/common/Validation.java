package lotto.common;

import java.util.List;

import static lotto.common.Constants.*;
import static lotto.view.ErrorMessages.*;

public class Validation {

    // 돈 검증
    public static void validateMoney(int money) {
        if (money % TICKET_PRICE != 0) {
            throw new IllegalArgumentException(INVALID_MONEY.getMessage());
        }
    }

    // 개수 검증
    public static void validateSize(List<Integer> numbers) {
        if (numbers.size() != LOTTO_NUMBERS_COUNT) {
            throw new IllegalArgumentException(INVALID_SIZE.getMessage());
        }
    }

    // 번호 중복 검증
    public static void validateDuplicateNumbers(List<Integer> numbers) {
        if (numbers.size() != numbers.stream().distinct().count()) {
            throw new IllegalArgumentException(DUPLICATED_NUMBERS.getMessage());
        }
    }

    // range 검증
    public static void validateNumberRange(List<Integer> numbers) {
        if (numbers.stream().anyMatch(num -> num < LOTTO_BOUND_START || num > LOTTO_BOUND_END)) {
            throw new IllegalArgumentException(INVALID_RANGE.getMessage());
        }
    }

    // 보너스 번호 검증 (로또 번호와 겹치지 않는지)
    public static void validateBonusNumber(int bonusNumber, List<Integer> numbers) {
        if (numbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(DUPLICATED_BONUS_NUMBER.getMessage());
        }
    }

}

