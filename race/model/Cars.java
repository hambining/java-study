package race.model;

import race.controller.RandNum;
import race.view.Messages;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        validateNames();
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

    public void validateNames() {
        cars.stream().map(Car::getName)
                .forEach(car -> {
                    if (car.length() > 5) {
                        Messages.ILLEGAL_ARGUMENT_STATE_ERROR.println();
                        throw new IllegalArgumentException("글자수 제한 오류");
                    }
                });
    }

    public void setCarsCondition() {
        RandNum randNum = new RandNum();
        cars.forEach(car -> car.setConditionNum(randNum.getRandNum()));
    }
}
