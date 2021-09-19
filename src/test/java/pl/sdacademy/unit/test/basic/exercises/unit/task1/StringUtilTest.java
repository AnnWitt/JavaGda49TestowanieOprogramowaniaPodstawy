package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void shouldReturnTrueIFStringEmpty() {
        //given - tworzymy wartosc wejsciowa,
        String input = "";
        //boolean expectedResult=false; //X
        //wheny
        boolean result = StringUtil.isBlank(input);
        //then - tu dokonujemy porownania
        //assertTrue(result); //X zbędnn
        //dla assertJ
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIFStringSpace() {
        //given
        String input = " ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIFStringNull() {
        //given
        String input = null;
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIFStringNewLine() {
        //given
        String input = "\n";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertThat(result).isTrue(); //czego oczekujemy od metody
    }

    @Test
    void shouldReturnFalseIFStringSPa() {
        //given
        String input = " a";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIFStringaSP() {
        //given
        String input = "a ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIFSPStringaSP() {
        //given
        String input = " a ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIFString2Space() {
        //given
        String input = "  ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertThat(result).isTrue();
    }
}