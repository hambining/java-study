package baseball.view;

import baseball.common.Validation;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public int getUserInput() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            ErrorMessages.MISMATCH_INPUT_ERROR.println();
            throw new InputMismatchException("입력 형식 오류");
        }
    }

    public int[] getUserInputNumArr() {
        int num = getUserInput();
        validateInputLength(num);
        int[] numArr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        validateDuplicatedInput(numArr);
        return numArr;
    }

    public void validateInputLength(int num) {
        if (Validation.isOverThanMaxInputLength(num)) {
            ErrorMessages.OVER_MAX_LENGTH_ERROR.println();
            throw new IllegalArgumentException("입력 수 제한 오류");
        }
    }

    public void validateDuplicatedInput(int[] numArr) {
        if (Validation.hasDuplicationNumbers(numArr)) {
            ErrorMessages.DUPLICATED_INPUT_ERROR.println();
            throw new IllegalArgumentException("중복 입력 오류");
        }
    }
}
