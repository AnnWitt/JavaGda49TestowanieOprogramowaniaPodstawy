package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringUtilWithParameterizedTestMethodSource {
    @ParameterizedTest
    @MethodSource("provideData") //nasza metoda provideData
    void shouldReturnCorrectResult(String input, boolean expectedResult) {
        boolean result = StringUtilWithParameterized.isBlank(input);
       assertEquals(expectedResult,result);
    }

    private static Stream<Arguments> provideData() {

        return Stream.of(
           //tu pojedyncze argumemty
          //dla tych, które maja wiecej niż jednen parametr
          //value source nie poradzi sobie a kilka valuesource
                // //nie mozna
                Arguments.of("a",false),
                Arguments.of(" a",false),
                Arguments.of("a ",false),
                Arguments.of(" a ",false),
                Arguments.of(" ",true),
                Arguments.of("",true),
                Arguments.of("\n",true),
                Arguments.of(null,true)
                //w streamie wszystkie mozliwe casy
        ); // jedna metoda zamiast kilku
    }

    //----------------------
}
