package baseball.output;

import baseball.result.Result;

public class OutputImpl implements Output {

    @Override
    public void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    @Override
    public void printResult(Result result) {
        if (result.isNothing()) {
            System.out.println("낫싱");
            return;
        }

        StringBuilder sb = new StringBuilder();
        if (result.getBall() != 0) {
            sb.append(result.getBall() + "볼 ");
        }
        if (result.getStrike() != 0) {
            sb.append(result.getStrike() + "스트라이크");
        }
        System.out.println(sb);
    }

    @Override
    public void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
