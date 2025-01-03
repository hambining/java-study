package baseball.view;

public enum Messages {
    START_GAME("숫자 야구 게임을 시작합니다."),
    END_GAME("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    PRINT_BALL("%d볼 "),
    PRINT_STRIKE("%d스트라이크 "),
    NOTHING("낫싱"),
    RESTART_GAME("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요: "),
    INPUT_NUMBER("숫자를 입력해주세요: ");

    public final String message;

    Messages(String message) {
        this.message = message;
    }

    public void print() {
        System.out.print(message);
    }

    public void println() {
        System.out.println(message);
    }

    public void printNum(int num) {
        System.out.printf(message, num);
    }
}
