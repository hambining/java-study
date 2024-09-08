package model;

import controller.GameSetting;
import view.UserInput;
import view.Messages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class UserNumList implements NumList {
    ArrayList<Integer> userNumList;
    public UserNumList() {
        userNumList = new ArrayList<>(GameSetting.SIZE_OF_NUMBER_LIST);
    }

    public void setUserNumList(UserInput input) {
        Messages.INPUT_NUMBER.print();
        int[] userNum = Stream.of(String.valueOf(input.getUserInput()).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.stream(userNum)
                .forEach(i -> addNum(i));
//        addNum(input.getUserInput());
    }

    @Override
    public void addNum(int num) {
//        while (num > 0) {
//            userNumList.add(0, num % 10);
//            num /= 10;
//        }
        userNumList.add(num);
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
