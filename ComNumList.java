import java.util.ArrayList;

public class ComNumList implements NumList{
    ArrayList<Integer> comNumList;

    public ComNumList() {
        comNumList = new ArrayList<>(3);
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
    public ArrayList<Integer> getNumList() {
        return comNumList;
    }

    @Override
    public Integer getNum(int index) {
        return Integer.valueOf(comNumList.get(index));
    }
}