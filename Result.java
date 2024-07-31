public class Result {
    private int strike;
    private int ball;
    private int again;

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

    public void initStrike() {
        this.strike = 0;
    }

    public void initBall() {
        this.ball = 0;
    }

    public void setAgain(int again) {
        this.again = again;
    }
}
