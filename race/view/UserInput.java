package race.view;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public String[] getCarNamesArr() {
        Messages.ENTER_NAME.println();
        String names = sc.nextLine();
        return names.split(",");
    }

    public int getAmount() {
        Messages.ENTER_AMOUNT.println();
        return sc.nextInt();
    }
}
