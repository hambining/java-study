package lotto.view;

import static lotto.common.Constants.*;

public enum ErrorMessages {
    INVALID_MONEY("금액은 1,000원으로 나누어 떨어져야 합니다."),
    INVALID_SIZE("로또 번호는 6개여야 합니다."),
    DUPLICATED_NUMBERS("로또 번호는 중복될 수 없습니다."),
    DUPLICATED_BONUS_NUMBER("보너스 번호는 당첨 번호와 겹치지 않아야 합니다."),
    INVALID_RANGE("로또 번호는 1에서 45 사이의 수여야 합니다.");

    private final String message;

    ErrorMessages(String message) {
        this.message = ERROR_PREFIX + message;
    }

    public String getMessage() {
        return message;
    }

    public static void println(String message) {
        System.out.println(message);
    }
}
