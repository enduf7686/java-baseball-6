package baseball.config;

import baseball.computer.Computer;
import baseball.computer.NumberGenerator;
import baseball.computer.RandomNumberGenerator;
import baseball.game.Game;
import baseball.input.Input;
import baseball.input.InputImpl;
import baseball.numbercomparator.NumberComparator;
import baseball.output.Output;
import baseball.output.OutputImpl;

public class Configuration {

    public static Game game() {
        return new Game(input(), output(), computer(), numberComparator());
    }

    public static Input input() {
        return new InputImpl();
    }

    public static Output output() {
        return new OutputImpl();
    }

    private static Computer computer() {
        return new Computer(numberGenerator());
    }

    private static NumberGenerator numberGenerator() {
        return new RandomNumberGenerator();
    }

    private static NumberComparator numberComparator() {
        return new NumberComparator();
    }
}
