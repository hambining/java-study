package race.view;

public enum Messages {
    ENTER_NAME("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)"),
    ENTER_AMOUNT("시도할 횟수는 몇회인가요?"),
    RESULT("실행 결과"),
    WINNER("최종 우승자"),
    CAR_NAME("%s"),
    SEPARATOR_COLON(" : "),
    SEPARATOR_COMMA(", "),
    DISTANCE("-"),
    ILLEGAL_ARGUMENT_STATE_ERROR("자동차 이름은 5글자 이하로만 입력할 수 있습니다.");

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

    public void printf(String name) {
        System.out.printf(message, name);
    }

    public static void printResult(String winnersNames) {
        WINNER.print();
        SEPARATOR_COLON.print();
        CAR_NAME.printf(winnersNames);
    }

}