import java.util.ArrayList;

public class Check {
    Result result = new Result();

    public void count(ArrayList<Integer> comNumList, ArrayList<Integer> userNumList) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (comNumList.get(i).equals(userNumList.get(j))) {
                    result.increaseBall();
                    if (comNumList.indexOf(comNumList.get(i)) == userNumList.indexOf(userNumList.get(j))) {
                        result.decreaseBall();
                        result.increaseStrike();
                    }
                }
            }
        }
    }


}
