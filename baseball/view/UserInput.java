package baseball.view;

import java.util.Scanner;
import java.util.stream.Stream;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public int getUserInput() {
        return sc.nextInt();
    }

    public int[] getUserInputNumArr(int num) {
        return Stream.of(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
