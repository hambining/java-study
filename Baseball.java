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

            System.out.println("숫자 야구 게임을 시작합니다.");
            while (comNumList.getNumList().size() < 3) {
                comNumList.addNum(randomNum.getRandomNum());
            }
            System.out.println();

            while (true) {
                // Get 3 numbers from user
                System.out.print("숫자를 입력해주세요: ");

                // set userNumList
                userNumList.addNum(input.getUserInput());

                // initialize ball & strike count
                result.setBall(0);
                result.setStrike(0);

                // Count ball & strike
                check.count(comNumList.getNumList(), userNumList.getNumList());

                // print game re-start/end
                if (result.getStrike() == 0 && result.getBall() == 0) {
                    System.out.println("nothing");
                } else if (result.getStrike() == 3) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요: ");
                    result.setAgain(input.getUserInput());
                    comNumList.clear();
                    userNumList.clear();
                    break;
                } else {
                    System.out.println(result.getBall() + "볼 " + result.getStrike() + "스트라이크");
                }
                userNumList.clear();
            }
        }
    }

}