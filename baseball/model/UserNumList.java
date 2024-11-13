package baseball.model;

import baseball.common.ConstVariable;
import baseball.controller.GameSetting;
import baseball.view.UserInput;
import baseball.view.Messages;

import java.util.ArrayList;

public class UserNumList implements NumList {
    ArrayList<Integer> userNumList;
    public UserNumList() {
        userNumList = new ArrayList<>(GameSetting.SIZE_OF_NUMBER_LIST);
    }

    public void setUserNumList(UserInput input) {
        Messages.INPUT_NUMBER.print();
        addNum(input.getUserInput());
    }

    @Override
    public void addNum(int num) {
        while (num > 0) {
            userNumList.add(0, num % 10);
            num /= 10;
        }
    }

    @Override
    public void clear() {
        userNumList.clear();
    }

    @Override
    public Integer getNum(int index) {
        return userNumList.get(index);
    }
}
