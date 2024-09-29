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
        Cars cars = new Cars(getCars(carNames));
        CarCondition carCondition = new CarCondition(cars.getCars());
        Winner winner = new Winner(cars.getCars());

        int amount = userInput.getAmount();


        Messages.RESULT.println();
        for (int i = 0; i < amount; i++) {
            race(carCondition, cars);
            Messages.printProcess(cars.getCars());
        }

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
