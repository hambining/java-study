package race.model;

public class Winner {
    Cars cars;

    public Winner(Cars cars) {
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
