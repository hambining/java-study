package race.model;

public class Car {
    private final String name;
    private int conditionNum = 0;
    private int distance = 0;

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
