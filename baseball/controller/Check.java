package baseball.controller;

import baseball.common.ConstVariable;
import baseball.model.NumList;
import baseball.model.Result;

public class Check {
    public void count(NumList comNumList, NumList userNumList, Result result) {
        for (int i = 0; i < ConstVariable.SIZE_OF_NUMBER_LIST; i++) {
            for (int j = 0; j < ConstVariable.SIZE_OF_NUMBER_LIST; j++) {
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
