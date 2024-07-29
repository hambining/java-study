import java.util.ArrayList;

public class GameResult {

    int again = Result.again;

    public void getGameResult(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            Messages.NOTHING.println();
        } else if (strike == 3) {
            Messages.END_GAME.println();
            Messages.RESTART_GAME.print();
            // Initialize again
            again = 0;
        } else {
            Messages.PRINT_BALL.printNum(ball);
            Messages.PRINT_STRIKE.printNum(strike);
            System.out.println();
        }
    }
}
