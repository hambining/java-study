import java.util.ArrayList;

public class Check {
    public void count(ArrayList<Integer> comNumList, ArrayList<Integer> userNumList, Result result) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (comNumList.get(i).equals(userNumList.get(j))) {
                    result.increaseBall();
                    if (i == j) {
                        result.decreaseBall();
                        result.increaseStrike();
                    }
                }
            }
        }
    }


}
