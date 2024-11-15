package baseball.controller;

import java.util.ArrayList;
import java.util.Collections;

public class RandNum {

    public int[] getRandNumArr() {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        return numbers.subList(0, 3).stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
