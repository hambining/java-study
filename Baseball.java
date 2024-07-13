import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> comNumList = new ArrayList<>(3);
        ArrayList<Integer> userNumList = new ArrayList<>(3);
        int ballCount = 0;
        int strikeCount = 0;
        int again = 0;

        while (true) {
            if (again == 2) break;
            comNumList.clear();
            System.out.println("숫자 야구 게임을 시작합니다.");

            // Generate 3 random numbers for computer
            int comNum;
            int i = 0;
            while (true) {
                comNum = random.nextInt(9) + 1;
                if (!comNumList.contains(comNum)) {
                    comNumList.add(comNum);
                    i++;
                    System.out.println(comNum);
                }
                if (i == 3) break;
            }

            while (true) {
                // Get 3 numbers from user
                int userNum;
                System.out.print("숫자를 입력해주세요: ");
                userNum = sc.nextInt();
                while (userNum > 0) {
                    userNumList.add(0, userNum % 10);
                    userNum /= 10;
                }

                ballCount = 0;
                strikeCount = 0;
                // Count ball & strike
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (comNumList.get(j) == userNumList.get(k)) {
                            ballCount++;
                            if (comNumList.indexOf(comNumList.get(j)) == userNumList.indexOf(userNumList.get(k))) {
                                strikeCount++;
                                ballCount--;
                            }
                        }
                    }
                }

                // print & game re-start/end
                if (strikeCount == 0 && ballCount == 0) {
                    System.out.println("nothing");
                } else if (strikeCount == 3) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요: ");
                    again = sc.nextInt();
                    break;
                } else {
                    System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
                }
            }
        }
    }
}