package lotto.view;

import lotto.common.InputReader;
import java.util.Scanner;

public class UserInput {
    private final Scanner sc = new Scanner(System.in);
    private final LottoPrinter printer = new LottoPrinter();

    public int readMoney() {
        printer.printMessage(Messages.ENTER_MONEY);
        return Integer.parseInt(sc.nextLine());
    }

    public String readWinningNumbers() {
        printer.printMessage(Messages.ENTER_WINNING_NUMBERS);
        return sc.nextLine();
    }

    public int readBonusNumber() {
        printer.printMessage(Messages.ENTER_BONUS_NUMBER);
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
