package baseball.common;

public class Validation {
    // userInput 들어오는 숫자가 3자리인지도 검증
    public static boolean isOverThanMaxInputLength(int num) {
        return String.valueOf(num).length() > ConstVariable.SIZE_OF_NUMBER_LIST;
    }

    // 그 뭐냐 userInput 중복 안 되게 검증
    // 은 조금 어려운데
}
