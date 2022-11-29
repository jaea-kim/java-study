package baseballGame;

import java.util.*;

public class Player {
    public List<Integer> playerNum() {
        List<Integer> inputNum = new ArrayList<>();
        String num = checkNum();
        for (int i = 0; i < 3; i++) {
            inputNum.add(num.charAt(i) - '0');
        }
        System.out.println(inputNum.toString());
        return inputNum;
    }

    private String checkNum() {
        String num = "";
        while (true) {
            num = inputNum();
            if(!checkThreeNum(num)) continue;
            if(!checkOverlapNum(num)) continue;
            return num;
        }
    }
    private String inputNum() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("숫자를 입력해주세요 ex)123 => ");
                return Integer.toString(scanner.nextInt());
            }
            catch (Exception e) {
                System.out.println("잘묏된 입력입니다. 다시 입력해주세요.");
                scanner = new Scanner(System.in);
            }
        }
    }

    private boolean checkThreeNum(String num) {
        //String num = "";
        //while (true) {
            //num = inputNum();
            if (!(num.length() == 3)) {
                System.out.println("3자리의 수가 아닙니다. 다시 입력하세요.");
                return false;
                //continue;
            }
            return true;
            //break;
        //}
        //return num;
    }

    private boolean checkOverlapNum(String num) {
        //String num = "";
        if (!(num.length() == 3)) {
            System.out.println("");
        }

    }
}
