package race.model;

import java.util.List;

public class Winner {
    List<Car> cars;

    public Winner(List<Car> cars) {
        this.cars = cars;
    }

    public String[] getWinnerArray() {
        int max = cars.stream().mapToInt(Car::getDistance).max().orElse(0);
        return cars.stream().filter(car -> car.getDistance() == max)
                .map(Car::getName).toArray(String[]::new);
    }

    public String getWinnersNames() {
        StringBuilder winnerNames = new StringBuilder();
        String[] winners = getWinnerArray();
        for (String winner : winners) {
            winnerNames.append(winner);
            winnerNames.append(", ");
        }
        return winnerNames.substring(0, winnerNames.length() - 2);
    }
}
