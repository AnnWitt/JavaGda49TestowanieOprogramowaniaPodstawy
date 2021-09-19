package pl.sdacademy.unit.test.basic.exercises.tdd.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void shouldReturnCorrectValue(int index, int expectedResult) {
        //given
        Fibonacci fibonacci=new Fibonacci(); //moznaby poza ale dla
        //jednego bez sensu

        //when
        int result = fibonacci.getValueFromIndex(index);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(0,0), //indeks p[otem wartosc
                Arguments.of(1,1), //indeks
                Arguments.of(2,1),
                Arguments.of(6,8),
                Arguments.of(14,377)
        );
    }

    //-----
}