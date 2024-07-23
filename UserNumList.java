import java.util.ArrayList;

public class UserNumList extends NumList {
    ArrayList<Integer> userNumList;
    public UserNumList() {
        userNumList = new ArrayList<>(3);
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
    public ArrayList<Integer> getNumList() {
        return userNumList;
    }
}
