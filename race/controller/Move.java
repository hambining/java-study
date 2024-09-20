package race.controller;

import race.model.Car;

import java.util.List;

public class Move {
    List<Car> cars;

    public Move(List<Car> cars) {
        this.cars = cars;
    }

    public void move() {
        cars.stream()
                .filter(car -> car.getConditionNum() >= 4)
                .forEach(Car::increaseDistance);
    }

}
