package baseballGame;

import java.util.*;

public class Computer {
    public static List<Integer> selectRandomNum() {
        List<Integer> randomNum = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            randomNum.add(i);
        }
        Collections.shuffle(randomNum);
        randomNum = randomNum.subList(0,3);
        return randomNum;
    }
}
