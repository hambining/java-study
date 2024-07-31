public class Check {
    public void count(ComNumList comNumList, UserNumList userNumList, Result result) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((comNumList.getNum(i)).equals(userNumList.getNum(j))) {
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
