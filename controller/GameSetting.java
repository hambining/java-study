package controller;

import model.ComNumList;
import model.Result;
import model.UserNumList;
import view.Messages;
import view.UserInput;

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

    public static final int SIZE_OF_NUMBER_LIST = 3;
    public static final int END_GAME = 2;

    public void startGame() {
        messages.START_GAME.println();

        while (result.getAgain() != END_GAME) {

            result.initBallAndStrike();

            numList.setNumList(comNumList, userNumList);

            // Count ball & strike
            check.count(comNumList, userNumList, result);

            // print game re-start/end
            gameResult.getGameResult(result, comNumList, userNumList, input);
        }
    }
}
