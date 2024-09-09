package model;
import controller.GameSetting;
import controller.RandomNum;

import java.util.ArrayList;

public class ComNumList implements NumList {
    ArrayList<Integer> comNumList;

    public ComNumList() {
        comNumList = new ArrayList<>(GameSetting.SIZE_OF_NUMBER_LIST);
    }

    public void setComNumList(RandomNum randomNum) {
        // Add 3 random numbers to comNumList
        while (comNumList.size() < GameSetting.SIZE_OF_NUMBER_LIST) {
            addNum(randomNum.getRandomNum());
        }
        System.out.println();
    }

    @Override
    public void addNum(int num) {
        if (!comNumList.contains(num)) {
            comNumList.add(num);
            System.out.print(num);
        }
    }

    @Override
    public void clear() {
        comNumList.clear();
    }

    @Override
    public Integer getNum(int index) {
        return comNumList.get(index);
    }
}