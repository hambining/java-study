package race.model;

import race.common.ConstVariable;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Winner {
    Cars cars;

    public Winner(Cars cars) {
        this.cars = cars;
    }

    public String[] getWinnerArray() {
        int max = cars.getCars().stream().mapToInt(car -> car.getDistance().length()).max().orElseThrow(NoSuchElementException::new);
        return cars.getCars().stream().filter(car -> car.getDistance().length() == max)
                .map(Car::getName).toArray(String[]::new);
    }

    public String getWinnersNames() {
        String[] winners = getWinnerArray();
        return Arrays.stream(winners).map(String::valueOf)
                .collect(Collectors.joining(ConstVariable.SEPARATOR_COMMA));
    }
}
