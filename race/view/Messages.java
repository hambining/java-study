package race.view;

import race.model.Car;

import java.util.List;

public enum Messages {
    ENTER_NAME("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)"),
    ENTER_AMOUNT("시도할 횟수는 몇회인가요?"),
    RESULT("실행 결과"),
    STR(""),
    WINNER("최종 우승자"),
    CAR_NAME("%s"),
    SEPARATOR(" : "),
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

    public void printFor(int distance) {
        for (int i = 0; i < distance; i++) {
            System.out.print(message);
        }
        System.out.println();
    }

    public void printProcess(List<Car> cars) {
        cars.forEach(car -> {
            String name = car.getName();
            int distance = car.getDistance();

            CAR_NAME.printf(name);
            SEPARATOR.print();
            DISTANCE.printFor(distance);
        });
        System.out.println();
    }

    public void printWinner(String[] winners) {
        WINNER.print();
        SEPARATOR.print();

        StringBuilder winnerNames = new StringBuilder();
        for (String winner : winners) {
            winnerNames.append(winner);
            winnerNames.append(", ");
        }

        CAR_NAME.printf(winnerNames.substring(0, winnerNames.length() - 2));
    }

}