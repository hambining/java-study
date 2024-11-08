package race.controller;

import race.common.ConstVariable;

import java.util.Random;

public class RandNum {
    Random random = new Random();

    public int getRandNum() {
        return random.nextInt(ConstVariable.RANDOM_NUMBER_BOUND);
    }
}
