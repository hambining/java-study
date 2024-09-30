package race.controller;

import race.view.Messages;

import java.util.Arrays;

public class CheckException {
    public void checkIllegalArgumentException(String[] carNames) {
        Arrays.stream(carNames).forEach(car -> {
            if (car.length() > 5) {
                Messages.ILLEGAL_ARGUMENT_STATE_ERROR.println();
                throw new IllegalArgumentException("글자수 제한 오류");
            }
        });
    }

}
