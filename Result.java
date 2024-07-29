public class Result {
    public static int strike;
    public static int ball;
    public static int again;

    public Result() {
        strike = 0;
        ball = 0;
        again = 0;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getAgain() {
        return again;
    }

    public void increaseBall() {
        ball++;
    }

    public void decreaseBall() {
        ball--;
    }

    public void increaseStrike() {
        strike++;
    }

    public static void setStrike(int strike) {
        Result.strike = strike;
    }

    public static void setBall(int ball) {
        Result.ball = ball;
    }

    public static void setAgain(int again) {
        Result.again = again;
    }
}
