package race.model;

import race.controller.RandNum;

// 자동차 전진 조건 세팅
public class CarCondition {
    Cars cars;
    RandNum randNum = new RandNum();

    public CarCondition(Cars cars) {
        this.cars = cars;
    }

    public void setCarsCondition() {
        cars.forEach(car -> car.setConditionNum(randNum.getRandNum()));
    }

    public void initCarsCondition() {
        cars.forEach(Car::initConditionNum);
    }
}
