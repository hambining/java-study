package baseball.controller;

import baseball.common.ConstVariable;

import java.util.Random;

public class RandomNum {

    public int[] getRandNumArr() {
        Random random = new Random();
        int[] randNumArr = new int[ConstVariable.SIZE_OF_NUMBER_LIST];
        for (int i : randNumArr) {
            randNumArr[i] = random.nextInt(9) + 1;
        }
        return randNumArr;
    }
}
