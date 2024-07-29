public class Baseball {
    public static void main(String[] args) {
        Result result = new Result();
        ComNumList comNumList = new ComNumList();
        UserNumList userNumList = new UserNumList();
        UserInput input = new UserInput();
        Check check = new Check();
        RandomNum randomNum = new RandomNum();


        while (true) {
            if (result.getAgain() == 2) break;
            Messages.START_GAME.println();
            while (comNumList.getNumList().size() < 3) {
                comNumList.addNum(randomNum.getRandomNum());
            }
            System.out.println();

            while (true) {
                // Get 3 numbers from user
                Messages.INPUT_NUMBER.print();

                // set userNumList
                userNumList.addNum(input.getUserInput());


                // Count ball & strike
                check.count(comNumList.getNumList(), userNumList.getNumList());

                // print game re-start/end
                if (result.getStrike() == 0 && result.getBall() == 0) {
                    Messages.NOTHING.println();
                } else if (result.getStrike() == 3) {
                    Messages.END_GAME.println();
                    Messages.RESTART_GAME.print();
                    result.setAgain(input.getUserInput());
                    comNumList.clear();
                    userNumList.clear();
                    break;
                } else {
                    Messages.PRINT_BALL.printNum(result.getBall());
                    Messages.PRINT_STRIKE.printNum(result.getStrike());
                    System.out.println();
                }
                userNumList.clear();
            }
        }
    }

}