import java.util.ArrayList;

public class NumList {
    ArrayList<Integer> numList;

    public NumList() {
        this.numList = new ArrayList<>(3);
    }

    public void addNum(int num) {
        numList.add(num);
    }

    public void clear() {
        numList.clear();
    }

    public ArrayList<Integer> getNumList() {
        return numList;
    }

}
