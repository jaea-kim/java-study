package baseballGame;

import java.util.List;

public class Game {
    public Game() { }

    public boolean play(List<Integer> computerNum, List<Integer> userNum) {
        if (computerNum.equals(userNum)) return true; //게임 종료 여부
        int strike = checkStrike(computerNum, userNum);
        int ball = checkBoll(computerNum, userNum) - strike;
        printResult(strike, ball);
        return false;
    }

    private int checkStrike(List<Integer> computerNum, List<Integer> userNum) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (computerNum.get(i).equals(userNum.get(i))) strike++;
        }
        return strike;
    }

    private int checkBoll(List<Integer> computerNum, List<Integer> userNum) {
        int ball = 0;
        for (int num : userNum) {
            if (computerNum.contains(num)) ball++;
        }
        return ball;
    }

    private void printResult(int strike, int ball) {
        if (strike == 0 && ball == 0) System.out.println("낫싱");
        else if (strike == 0 || ball == 0) System.out.println((strike==0) ? ball+"볼" : strike+"스트라이크");
        else {
            System.out.println(strike + "스트라이크" + ball +"볼");
        }
    }
}
