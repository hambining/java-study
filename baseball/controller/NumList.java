package baseball.controller;

import baseball.model.ComNumList;
import baseball.model.UserNumList;
import baseball.view.UserInput;

public class NumList {
    public void setNumList(ComNumList comNumList, UserNumList userNumList) {
        RandomNum randomNum = new RandomNum();
        comNumList.setComNumList(randomNum);

        UserInput input = new UserInput();
        userNumList.setUserNumList(input);
    }
}
