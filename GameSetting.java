public class GameSetting {
    // Create objects here
    Result result = new Result();
    ComNumList comNumList = new ComNumList();
    UserNumList userNumList = new UserNumList();
    UserInput input = new UserInput();
    Check check = new Check();
    RandomNum randomNum = new RandomNum();
    GameResult gameResult = new GameResult();

    public void startGame() {
        Messages.START_GAME.println();

        while (result.getAgain() != 2) {

            result.initBallAndStrike();

            // Add 3 random numbers to comNumList
            while (comNumList.getNumList().size() < 3) {
                comNumList.addNum(randomNum.getRandomNum());
            }
            System.out.println();

            // Get 3 numbers from user
            Messages.INPUT_NUMBER.print();

            // Set userNumList
            userNumList.addNum(input.getUserInput());

            // Count ball & strike
            check.count(comNumList, userNumList, result);

            // print game re-start/end
            gameResult.getGameResult(result, comNumList, userNumList);
        }
    }
}
