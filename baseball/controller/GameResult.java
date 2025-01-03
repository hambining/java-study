package baseball.controller;

import baseball.model.NumList;
import baseball.model.Result;
import baseball.view.Messages;
import baseball.view.UserInput;

public class GameResult {
    public void getGameResult(Result result, NumList comNumList, NumList userNumList, UserInput userInput) {
        int strike = result.getStrike();
        int ball = result.getBall();
        if (strike == 0 && ball == 0) {
            Messages.NOTHING.print();
        } else if (strike == 3) {
            Messages.END_GAME.println();
            Messages.RESTART_GAME.print();

            result.setAgain(userInput.getUserInput());
            comNumList.clear();
        } else {
            Messages.PRINT_BALL.printNum(ball);
            Messages.PRINT_STRIKE.printNum(strike);
        }
        userNumList.clear();
    }
}
