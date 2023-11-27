package baseball.number;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class NumberTest {

    @ParameterizedTest
    @MethodSource("baseball.number.NumberTestArgumentsProvider#provideCorrectArguments")
    @DisplayName("Number 생성 테스트")
    void testCorrectInput(List<Integer> input) {
        new Number(input);
    }

    @ParameterizedTest
    @MethodSource("baseball.number.NumberTestArgumentsProvider#provideExceptionArguments")
    @DisplayName("Number 생성 예외 테스트")
    void testExceptionInput(List<Integer> input) {
        assertThatThrownBy(() -> new Number(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}