public class GameResult {
    UserInput userInput = new UserInput();

    public void getGameResult(Result result, ComNumList comNumList, UserNumList userNumList) {
        int strike = result.getStrike();
        int ball = result.getBall();
        if (strike == 0 && ball == 0) {
            Messages.NOTHING.print();
        } else if (strike == 3) {
            Messages.END_GAME.println();
            Messages.RESTART_GAME.print();

            result.setAgain(userInput.getUserInput());
            comNumList.clear();
            userNumList.clear();
        } else {
            Messages.PRINT_BALL.printNum(ball);
            Messages.PRINT_STRIKE.printNum(strike);
        }
    }
}
