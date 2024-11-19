package baseball.controller;

import baseball.common.ConstVariable;

import java.util.Random;

public class RandNum {

    public int[] getRandNumArr() {
        Random random = new Random();
        int[] randNumArr = new int[ConstVariable.SIZE_OF_NUMBER_LIST];

        for (int i = 0; i < ConstVariable.SIZE_OF_NUMBER_LIST; i++) {
            randNumArr[i] = random.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (randNumArr[i] == randNumArr[j]) i--;
            }
        }

        return randNumArr;
    }
}
