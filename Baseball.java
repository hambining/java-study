public class Baseball {
    public static void main(String[] args) {
        Result result = new Result();
        ComNumList comNumList = new ComNumList();
        UserNumList userNumList = new UserNumList();
        UserInput input = new UserInput();
        Check check = new Check();
        RandomNum randomNum = new RandomNum();
        GameResult gameResult = new GameResult();

        Messages.START_GAME.println();
        while (true) {
            if (result.getAgain() == 2) break;
            while (comNumList.getNumList().size() < 3) {
                comNumList.addNum(randomNum.getRandomNum());
            }
            System.out.println();

            // Get 3 numbers from user
            Messages.INPUT_NUMBER.print();

            // set userNumList
            userNumList.addNum(input.getUserInput());

            // Count ball & strike
            check.count(comNumList.getNumList(), userNumList.getNumList(), result);

            // print game re-start/end
            gameResult.getGameResult(result, comNumList, userNumList);

            result.initBall();
            result.initStrike();
        }
    }

}