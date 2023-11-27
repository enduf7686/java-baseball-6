package baseball.input;

import baseball.number.Number;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class InputImpl implements Input {

    @Override
    public Number readNumber() {
        String input = validate(read());
        return new Number(createList(input));
    }

    @Override
    public int readRestartNumber() {
        String input = Console.readLine();
        return Integer.parseInt(input);
    }

    private String read() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    private String validate(String input) {
        if (!Pattern.matches("^[0-9]+$", input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    private List<Integer> createList(String input) {
        return Arrays.stream(input.split(""))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
    }
}
