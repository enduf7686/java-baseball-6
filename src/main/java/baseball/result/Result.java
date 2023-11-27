package baseball.result;

import static baseball.result.ResultCond.BALL;
import static baseball.result.ResultCond.STRIKE;

import java.util.List;
import java.util.stream.IntStream;

public class Result {

    private int strike;
    private int ball;

    public Result(List<ResultCond> results) {
        IntStream.range(0, 3).forEach(i -> {
            if (results.get(i) == STRIKE) {
                strike++;
            }
            if (results.get(i) == BALL) {
                ball++;
            }
        });
    }
}
