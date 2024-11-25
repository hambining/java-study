package baseball.controller;

import baseball.common.ConstVariable;

import java.util.Random;

public class RandNum {

    public int[] getRandNumArr() {
        Random random = new Random();
        int[] randNumArr = new int[ConstVariable.SIZE_OF_NUMBER_LIST];

        for (int i = 0; i < ConstVariable.SIZE_OF_NUMBER_LIST; i++) {
            randNumArr[i] = ConstVariable.RANDOM_MIN_VALUE + random.nextInt(ConstVariable.RANDOM_MAX_VALUE);
            for (int j = 0; j < i; j++) {
                if (randNumArr[i] == randNumArr[j]) i--;
            }
        }

        return randNumArr;
    }
}
