package controller;

import model.ComNumList;
import model.UserNumList;
import view.UserInput;

public class NumList {
    public void setNumList(ComNumList comNumList, UserNumList userNumList) {
        RandomNum randomNum = new RandomNum();
        comNumList.setComNumList(randomNum);

        UserInput input = new UserInput();
        userNumList.setUserNumList(input);
    }
}
