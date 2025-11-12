package lotto.view;

import lotto.common.InputReader;
import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public int readMoney() {
        Messages.ENTER_MONEY.println();
        return Integer.parseInt(sc.nextLine());
    }

        Messages.ENTER_WINNING_NUMBERS.println();
    public String readWinningNumbers() {
        return sc.nextLine();
    }

    public int readBonusNumber() {
        Messages.ENTER_BONUS_NUMBER.println();
        return Integer.parseInt(sc.nextLine());
    }

    public <T> T repeatUntilValid(InputReader<T> reader) {
        while (true) {
            try {
                return reader.read();
            } catch (IllegalArgumentException e) {
                ErrorMessages.println(e.getMessage());
            }
        }
    }

}
