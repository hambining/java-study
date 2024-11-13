package baseball.controller;

import baseball.common.ConstVariable;
import baseball.model.ComNumList;
import baseball.model.Result;
import baseball.model.UserNumList;

public class Check {
    public void count(ComNumList comNumList, UserNumList userNumList, Result result) {
        for (int i = 0; i < GameSetting.SIZE_OF_NUMBER_LIST; i++) {
            for (int j = 0; j < GameSetting.SIZE_OF_NUMBER_LIST; j++) {
                if ((comNumList.getNum(i)).equals(userNumList.getNum(j))) {
                    result.increaseBall();
                    if (i == j) {
                        result.decreaseBall();
                        result.increaseStrike();
                    }
                }
            }
        }
    }


}
