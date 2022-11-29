package baseballGame;

import java.util.*;

public class Player {
    public List<Integer> playerNum() {
        List<Integer> inputNum = new ArrayList<>();
        String num = checkNum();
        for (int i = 0; i < 3; i++) {
            inputNum.add(num.charAt(i) - '0');
        }
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
            } catch (Exception e) {
                System.out.println("잘묏된 입력입니다. 다시 입력하세요.");
                scanner = new Scanner(System.in);
            }
        }
    }

    private boolean checkThreeNum(String num) {
        if (!(num.length() == 3)) {
            System.out.println("3자리의 수가 아닙니다. 다시 입력하세요.");
            return false;
        }
        return true;
    }

    private boolean checkOverlapNum(String num) {
        String check = "";
        for (char a : num.toCharArray()) {
            if (check.toString().contains(String.valueOf(a))) {
                System.out.println("중복된 숫지를 입력하였습니다. 다시 입력하세요.");
                return false;
            }
            check += String.valueOf(a);
        }
        return true;
    }
}
