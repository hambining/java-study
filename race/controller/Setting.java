package race.controller;

import race.model.Car;
import race.model.CarCondition;
import race.model.Winner;
import race.view.Messages;
import race.view.UserInput;

import java.util.ArrayList;
import java.util.List;

public class Setting {

    public void setRace() {
        // 사용자에게 입력 받기
        UserInput userInput = new UserInput();

        String[] carNames = userInput.getCarNamesArr();
        int amount = userInput.getAmount();


        // 경주할 자동차 생성
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }


        // 경주 조건 세팅
        CarCondition carCondition = new CarCondition(cars);
        Move move = new Move(cars);

        // 경주 시작 및 결과값 출력
        Messages.RESULT.println();
        for (int i = 0; i < amount; i++) {
            race(carCondition, move);
            Messages.STR.printProcess(cars);
        }

        // 우승자 출력
        Winner winner = new Winner(cars);
        Messages.STR.printWinner(winner.getWinner());
    }

    public void race(CarCondition carCondition, Move move) {
        carCondition.setCarsCondition();
        move.move();
        carCondition.initCarsCondition();
    }
}
