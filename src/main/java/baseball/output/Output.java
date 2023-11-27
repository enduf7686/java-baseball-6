package baseball.output;

import baseball.result.Result;

public interface Output {

    void printStartMessage();

    void printResult(Result result);

    void printEndMessage();
}
