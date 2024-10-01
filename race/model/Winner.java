package race.model;

import race.common.ConstVariable;
import race.view.Messages;

public class Winner {
    Cars cars;

    public Winner(Cars cars) {
        this.cars = cars;
    }

    public String[] getWinnerArray() {
        int max = cars.getCars().stream().mapToInt(Car::getDistance).max().orElse(0);
        return cars.getCars().stream().filter(car -> car.getDistance() == max)
                .map(Car::getName).toArray(String[]::new);
    }

    public String getWinnersNames() {
        StringBuilder winnerNames = new StringBuilder();
        String[] winners = getWinnerArray();
        for (String winner : winners) {
            winnerNames.append(winner);
            winnerNames.append(ConstVariable.SEPARATOR_COMMA);
        }
        return winnerNames.substring(0, winnerNames.length() - ConstVariable.UNNECESSARY_BLANK);
    }
}
