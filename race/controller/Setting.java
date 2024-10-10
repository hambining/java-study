package race.controller;

import race.model.Car;
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
        Winner winner = new Winner(cars);

        int amount = userInput.getAmount();


        Messages.RESULT.println();
        for (int i = 0; i < amount; i++) {
            race(cars);
            Messages.CAR_NAME.printf(cars.getProcess());
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

    public void race(Cars cars) {
        cars.setCarsCondition();
        cars.move();
    }
}
