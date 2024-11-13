package baseball.controller;

import java.util.Random;

public class RandomNum {

    public int getRandomNum() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
}
