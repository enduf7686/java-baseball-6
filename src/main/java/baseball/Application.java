package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다.");

        boolean end = false;
        while (!end) {
            BaseballGame.start();
            end = BaseballGame.endCheck();
        }
    }
}
