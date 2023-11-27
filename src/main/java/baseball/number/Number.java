package baseball.number;

import java.util.List;

public record Number(List<Integer> numbers) {

    public Number {
        validate(numbers);
    }

    public int get(int index) {
        return numbers.get(index);
    }

    public boolean contains(int value) {
        return numbers.contains(value);
    }

    private void validate(List<Integer> numbers) {
        checkSize(numbers);
        checkRange(numbers);
        checkDuplication(numbers);
    }

    private void checkSize(List<Integer> numbers) {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    private void checkRange(List<Integer> numbers) {
        int count = (int) numbers.stream()
                .filter(number -> number >= 1 && number <= 9)
                .count();
        if (count != 3) {
            throw new IllegalArgumentException();
        }
    }

    private void checkDuplication(List<Integer> numbers) {
        int count = (int) numbers.stream()
                .distinct()
                .count();
        if (count != 3) {
            throw new IllegalArgumentException();
        }
    }
}
