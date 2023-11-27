package baseball.game;

import static baseball.game.GameStatus.PLAYING;
import static baseball.game.GameStatus.setGameStatus;

import baseball.computer.Computer;
import baseball.input.Input;
import baseball.numbercomparator.NumberComparator;
import baseball.output.Output;
import baseball.result.Result;

public class Game {

    private final Input input;
    private final Output output;

    private final Computer computer;
    private final NumberComparator numberComparator;

    public Game(Input input, Output output, Computer computer, NumberComparator numberComparator) {
        this.input = input;
        this.output = output;
        this.computer = computer;
        this.numberComparator = numberComparator;
    }

    public void play() {
        GameStatus gameStatus = PLAYING;
        output.printStartMessage();

        while (gameStatus == PLAYING) {
            Result result = numberComparator.compare(computer.getNumber(), input.readNumber());
            output.printResult(result);

            if (result.isCorrect()) {
                output.printEndMessage();
                gameStatus = setGameStatus(input.readRestartNumber());
            }
        }
    }
}
