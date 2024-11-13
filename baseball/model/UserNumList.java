package baseball.model;

import baseball.common.ConstVariable;

import java.util.ArrayList;

public class UserNumList extends NumList {
    ArrayList<Integer> userNumList;

    public UserNumList() {
        userNumList = new ArrayList<>(ConstVariable.SIZE_OF_NUMBER_LIST);
    }

    @Override
    public void clear() {
        super.clear();
    }
}
