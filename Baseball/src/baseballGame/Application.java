package baseballGame;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        Player user = new Player();
        List<Integer> computerNum = Computer.selectRandomNum();
        System.out.println("컴퓨터 번호 => " + computerNum.toString());

        while (!game.play(computerNum, user.playerNum()));
        System.out.println("3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
