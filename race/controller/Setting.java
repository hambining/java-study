package race.controller;

import race.model.Car;
import race.model.CarCondition;
import race.model.Cars;
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
        CheckException checkException = new CheckException();
        checkException.checkIllegalArgumentException(carNames);
        int amount = userInput.getAmount();


        // 경주할 자동차 생성
        List<Car> carList = getCars(carNames);
        Cars cars = new Cars(carList);


        // 경주 조건 세팅
        CarCondition carCondition = new CarCondition(cars.getCars());

        // 경주 시작 및 결과값 출력
        Messages.RESULT.println();
        for (int i = 0; i < amount; i++) {
            race(carCondition, cars);
            Messages.STR.printProcess(cars.getCars());
        }

        // 우승자 출력
        Winner winner = new Winner(cars.getCars());
        Messages.STR.printResult(winner.getWinnersNames());
    }

    public List<Car> getCars(String[] carNames) {
        List<Car> carList = new ArrayList<>();
        for (String name : carNames) {
            carList.add(new Car(name));
        }
        return carList;
    }

    public void race(CarCondition carCondition, Cars cars) {
        carCondition.setCarsCondition();
        cars.move();
        carCondition.initCarsCondition();
    }
}
