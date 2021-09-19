package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilWithParameterizedTest {
    //kiedy zwroci false
    //"a", " a", "a ", " a ", "a b"
    //bysmy musieli kazda osobno ale ...TDD

    @ParameterizedTest  //tablice, zdefiniowane
    // i juz maja nazwy np string
    @ValueSource(strings = {"a", " a", "a ", " a ", "a b"})
        //mozna tez plik/oosobna klasa, liste obiektów
        // w nawiasie imputy tylko dla tego testu
    void shouldReturnFalseIfInputIsNotEmpty(String input) {
        //given-w tym przypadku niepotrzena bo mamy juz w valuesource
        //when
        boolean result = StringUtilWithParameterized.isBlank(input);
        //po kolei zaciag
        // elementow - przeleci to 5 razy po kazdym el tablicy
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }


    @ParameterizedTest
    @ValueSource(strings = {" ", "  ", "", " \n"})
    void shouldReturnTrueIfInputIsNotEmpty(String input) {
        boolean result = StringUtilWithParameterized.isBlank(input);
        assertTrue(result);
        assertThat(result).isTrue();
        //póki co ma sie wywalac bo zrobime refactor
    }

    @Test //tu juz nie musimy parametryzowac bo 1
    void shouldReturnTrueIfInputIsNull () {
        //dobrze to dac na poczatek (optymalnie)
        //when
        boolean result = StringUtilWithParameterized.isBlank(null);
        //then
        assertTrue(result);
        assertThat(result).isTrue();
        //poszło red, udawa bp null point exception
    }






}