package race.controller;

import java.util.Random;

public class RandNum {
    Random random = new Random();

    public int getRandNum() {
        return random.nextInt(10);
    }
}
