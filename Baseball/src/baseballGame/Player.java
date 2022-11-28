package baseballGame;

import java.util.*;

public class Player {
    public List<Integer> playerNum() {
        List<Integer> inputNum = new ArrayList<>();
        String num = inputNum();
        for (int i = 0; i < 3; i++) {
            inputNum.add(num.charAt(i) - '0');
        }
        System.out.println(inputNum.toString());
        return inputNum;
    }

    private String inputNum() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("숫자를 입력해주세요 ex)123 => ");
                //String num = scanner.nextLine();
                String num = Integer.toString(scanner.nextInt());
                for (int i = 0; i < 3; i++) {
                    inputNum.add(num.charAt(i) - '0');
                }
                System.out.println(inputNum.toString());
                return inputNum;
            }
            catch (Exception e) {
                //scanner = new Scanner(System.in);
                continue;
            }
            //break;
        }
    }
}
