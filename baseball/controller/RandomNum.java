package baseball.controller;

import baseball.common.ConstVariable;

import java.util.Random;

public class RandomNum {

    public int[] getRandNumArr() {
        Random random = new Random();
        int[] randNumArr = new int[3];
        for (int i : randNumArr) {
            randNumArr[i] = random.nextInt(9) + 1;
        }
        return randNumArr;
    }
}
