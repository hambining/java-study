public class Result {
    public static int strike;
    public static int ball;
    public static int again;

    public Result() {
        strike = 0;
        ball = 0;
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

    public void setBall(int ball) {
        this.ball = ball;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public void setAgain(int again) {
        this.again = again;
    }
}
