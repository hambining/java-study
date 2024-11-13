package baseball.model;

import baseball.common.ConstVariable;

public class Result {
    private int strike;
    private int ball;
    private int again;

    public Result() {
        strike = ConstVariable.INITIALIZING_NUMBER;
        ball = ConstVariable.INITIALIZING_NUMBER;
        again = ConstVariable.INITIALIZING_NUMBER;
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

    public void initBallAndStrike() {
        this.ball = ConstVariable.INITIALIZING_NUMBER;
        this.strike = ConstVariable.INITIALIZING_NUMBER;
    }

    public void setAgain(int again) {
        this.again = again;
    }
}
