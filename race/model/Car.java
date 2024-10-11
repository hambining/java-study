package race.model;

import race.common.ConstVariable;

public class Car {
    private final String name;
    private int conditionNum = ConstVariable.INITIALIZING_NUMBER;
    private int distance = ConstVariable.INITIALIZING_NUMBER;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void increaseDistance() {
        distance++;
    }

    public int getConditionNum() {
        return conditionNum;
    }

    public void setConditionNum(int num) {
        this.conditionNum = num;
    }
}
