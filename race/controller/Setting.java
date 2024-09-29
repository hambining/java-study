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
        UserInput userInput = new UserInput();

        String[] carNames = userInput.getCarNamesArr();
        CheckException checkException = new CheckException();
        checkException.checkIllegalArgumentException(carNames);
        int amount = userInput.getAmount();
        
        List<Car> carList = getCars(carNames);
        Cars cars = new Cars(carList);


        CarCondition carCondition = new CarCondition(cars.getCars());

        Messages.RESULT.println();
        for (int i = 0; i < amount; i++) {
            race(carCondition, cars);
            Messages.printProcess(cars.getCars());
        }

        Winner winner = new Winner(cars.getCars());
        Messages.printResult(winner.getWinnersNames());
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
