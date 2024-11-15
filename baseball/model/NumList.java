package baseball.model;

import baseball.common.ConstVariable;

import java.util.ArrayList;

public class NumList {
    ArrayList<Integer> numList;

    public NumList() {
        numList = new ArrayList<>(ConstVariable.SIZE_OF_NUMBER_LIST);
    }

    public void setNumList(int[] numArr) {
        for (int i = 0; i < ConstVariable.SIZE_OF_NUMBER_LIST; i++) {
            numList.add(numArr[i]);
        }
    }

    public void clear() {
        numList.clear();
    }

    public Integer getNum(int index) {
        return numList.get(index);
    }
}
