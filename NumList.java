import java.util.ArrayList;

public interface NumList {
    void addNum(int num);
    void clear();
    ArrayList<Integer> getNumList();

    int get(int index);
}
