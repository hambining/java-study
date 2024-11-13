package baseball.controller;

import baseball.common.ConstVariable;
import baseball.model.ComNumList;
import baseball.model.Result;
import baseball.model.UserNumList;
import baseball.view.Messages;
import baseball.view.UserInput;

public class GameSetting {
    // Create objects here
    Result result = new Result();
    ComNumList comNumList = new ComNumList();
    UserNumList userNumList = new UserNumList();
    UserInput input = new UserInput();
    Check check = new Check();
    GameResult gameResult = new GameResult();
    Messages messages;
    NumList numList = new NumList();

    public void startGame() {
        messages.START_GAME.println();

        while (result.getAgain() != ConstVariable.END_GAME) {

            result.initBallAndStrike();

            numList.setNumList(comNumList, userNumList);

            // Count ball & strike
            check.count(comNumList, userNumList, result);

            // print game re-start/end
            gameResult.getGameResult(result, comNumList, userNumList, input);
        }
    }
}
