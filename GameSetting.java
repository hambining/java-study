public class GameSetting {
    // Create objects here
    Result result = new Result();
    ComNumList comNumList = new ComNumList();
    UserNumList userNumList = new UserNumList();
    UserInput input = new UserInput();
    Check check = new Check();
    RandomNum randomNum = new RandomNum();
    GameResult gameResult = new GameResult();

    public static final int SIZE_OF_LIST = 3;
    public static final int END_GAME = 2;

    public void startGame() {
        Messages.START_GAME.println();

        while (result.getAgain() != END_GAME) {

            result.initBallAndStrike();

            // Add 3 random numbers to comNumList
            comNumList.setComNumList(randomNum);

            // Get 3 numbers from user
            Messages.INPUT_NUMBER.print();

            // Set userNumList
            userNumList.addNum(input.getUserInput());

            // Count ball & strike
            check.count(comNumList, userNumList, result);

            // print game re-start/end
            gameResult.getGameResult(result, comNumList, userNumList, input);
        }
    }
}
