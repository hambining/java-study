package race.model;

import java.util.List;

public class Winner {
    List<Car> cars;

    public Winner(List<Car> c) {
        this.cars = c;
    }

    public String[] getWinner() {
        int max = cars.stream().mapToInt(Car::getDistance).max().orElse(0);
        return cars.stream().filter(car -> car.getDistance() == max)
                .map(Car::getName).toArray(String[]::new);
    }


}
