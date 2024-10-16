package race.model;

import race.common.ConstVariable;
import race.common.Validation;
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
                .filter(car -> Validation.isOverThanMaxNameLength(car.length()))
                .forEach(car -> {
                    Messages.ILLEGAL_ARGUMENT_STATE_ERROR.println();
                    throw new IllegalArgumentException("글자수 제한 오류");
                });
    }

    public void setCarsCondition() {
        RandNum randNum = new RandNum();
        cars.forEach(car -> car.setConditionNum(randNum.getRandNum()));
    }

    public String getProcess() {
        StringBuilder stringBuilder = new StringBuilder();
        cars.forEach(car -> stringBuilder.append(car.getName())
                .append(ConstVariable.SEPARATOR_COLON)
                .append(car.getDistance())
                .append('\n'));
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }
}
