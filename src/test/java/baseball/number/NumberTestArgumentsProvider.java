package baseball.number;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class NumberTestArgumentsProvider {

    static Stream<Arguments> provideCorrectArguments() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3)),
                Arguments.of(List.of(2, 3, 4)),
                Arguments.of(List.of(1, 5, 9)),
                Arguments.of(List.of(3, 5, 7)),
                Arguments.of(List.of(7, 8, 9)),
                Arguments.of(List.of(4, 5, 6)),
                Arguments.of(List.of(1, 4, 7)),
                Arguments.of(List.of(2, 5, 8)),
                Arguments.of(List.of(3, 6, 9))
        );
    }

    static Stream<Arguments> provideExceptionArguments() {
        return Stream.of(
                Arguments.of(List.of(1, 2)),
                Arguments.of(List.of(1, 2, 3, 4)),
                Arguments.of(List.of(1, 2, 10)),
                Arguments.of(List.of(0, 1, 2)),
                Arguments.of(List.of(1, 1, 2))
        );
    }
}
