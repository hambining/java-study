package view;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public int getUserInput() {
        return sc.nextInt();
    }
}
