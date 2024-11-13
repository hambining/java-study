package baseball.controller;

import baseball.common.ConstVariable;
import baseball.model.*;
import baseball.view.Messages;
import baseball.view.UserInput;

public class GameSetting {
    // Create objects here
    Result result = new Result();
    UserInput input = new UserInput();
    Check check = new Check();
    GameResult gameResult = new GameResult();
    RandNum randNum = new RandNum();

    ComNumList comNumList = new ComNumList();
    UserNumList userNumList = new UserNumList();

    public void startGame() {
        Messages.START_GAME.println();

        while (result.getAgain() != ConstVariable.END_GAME) {

            result.initBallAndStrike();

            comNumList.setNumList(randNum.getRandNumArr());
            userNumList.setNumList(input.getUserInputNumArr(input.getUserInput()));

            // Count ball & strike
            check.count(comNumList, userNumList, result);

            // print game re-start/end
            gameResult.getGameResult(result, comNumList, userNumList, input);
        }
    }
}