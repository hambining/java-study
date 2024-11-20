package baseball.view;

public enum ErrorMessages {
    DUPLICATED_INPUT_ERROR("입력한 숫자가 중복되었습니다."),
    OVER_MAX_LENGTH_ERROR("입력 제한 범위가 초과되었습니다."),
    MISMATCH_INPUT_ERROR("숫자만 입력할 수 있습니다.");

    public final String errorMessage;

    ErrorMessages (String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void println() {
        System.out.println(errorMessage);
    }
}


