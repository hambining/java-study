package baseball.view;

import baseball.common.ConstVariable;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public int getUserInput() {
        return sc.nextInt();
    }

    public int[] getUserInputNumArr() {
        int[] userNumArr = new int[ConstVariable.SIZE_OF_NUMBER_LIST];
        for (int i : userNumArr) {
            userNumArr[i] = sc.nextInt();
        }
        return userNumArr;
    }
}
