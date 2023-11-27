package baseball.numbercomparator;

import static baseball.result.ResultCond.BALL;
import static baseball.result.ResultCond.STRIKE;

import baseball.number.Number;
import baseball.result.Result;
import baseball.result.ResultCond;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NumberComparator {

    public Result compare(Number number1, Number number2) {
        return new Result(getCompareResults(number1, number2));
    }

    private List<ResultCond> getCompareResults(Number number1, Number number2) {
        List<ResultCond> results = new ArrayList<>();
        IntStream.range(0, 3).forEach(index -> {
            if (number1.get(index) == number2.get(index)) {
                results.add(STRIKE);
                return;
            }
            if (number1.contains(number2.get(index))) {
                results.add(BALL);
            }
        });
        return results;
    }
}
