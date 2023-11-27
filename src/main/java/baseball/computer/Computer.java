package baseball.computer;

import baseball.number.Number;

public class Computer {

    private final NumberGenerator numberGenerator;
    private final Number number;

    public Computer(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.number = new Number(numberGenerator.generate());
    }
}
