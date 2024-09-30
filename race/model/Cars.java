package race.model;

import race.common.ConstVariable;
import race.controller.RandNum;
import race.view.Messages;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
        validateNames();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void move() {
        cars.stream()
                .filter(car -> car.getConditionNum() >= ConstVariable.FORWARD_CONDITION)
                .forEach(Car::increaseDistance);
    }

    public void validateNames() {
        cars.stream().map(Car::getName)
                .forEach(car -> {
                    if (car.length() > ConstVariable.NAME_LENGTH_LIMIT) {
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
