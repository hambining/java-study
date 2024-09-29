package race.model;

import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void move() {
        cars.stream()
                .filter(car -> car.getConditionNum() >= 4)
                .forEach(Car::increaseDistance);
    }
}
