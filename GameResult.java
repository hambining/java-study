public class GameResult {
    UserInput userInput = new UserInput();

    public void getGameResult(int strike, int ball, ComNumList comNumList, UserNumList userNumList) {
        if (strike == 0 && ball == 0) {
            Messages.NOTHING.println();
        } else if (strike == 3) {
            Messages.END_GAME.println();
            Messages.RESTART_GAME.print();

            Result.setAgain(userInput.getUserInput());
            comNumList.clear();
            userNumList.clear();
        } else {
            Messages.PRINT_BALL.printNum(ball);
            Messages.PRINT_STRIKE.printNum(strike);
        }
    }
}
