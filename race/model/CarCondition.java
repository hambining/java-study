package race.model;

import race.controller.RandNum;

import java.util.List;

// 자동차 전진 조건 세팅
public class CarCondition {
    List<Car> cars;
    RandNum randNum = new RandNum();

    public CarCondition(List<Car> cars) {
        this.cars = cars;
    }

    public void setCarsCondition() {
        cars.forEach(car -> car.setConditionNum(randNum.getRandNum()));
    }

    public void initCarsCondition() {
        cars.forEach(Car::initConditionNum);
    }
}
