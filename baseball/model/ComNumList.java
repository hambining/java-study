package baseball.model;
import baseball.common.ConstVariable;

import java.util.ArrayList;

public class ComNumList extends NumList {
    ArrayList<Integer> comNumList;

    public ComNumList() {
        comNumList = new ArrayList<>(ConstVariable.SIZE_OF_NUMBER_LIST);
    }

    @Override
    public void clear() {
        super.clear();
    }
}