package lotto.common;

import java.util.Arrays;
import java.util.List;

public class InputParser {
    public static List<Integer> parseNumbers(String input, String separator) {
        return Arrays.stream(input.split(separator))
                .map(Integer::parseInt)
                .toList();
    }
}
