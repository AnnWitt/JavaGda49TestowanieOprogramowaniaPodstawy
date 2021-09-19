package pl.sdacademy.unit.test.basic.exercises.unit.task5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithExceptionTest {

    //aby byl dostep, wyciagamy aby dzialalo w obrebie calej klasy
    //a nie tylko init
    private static CalculatorWithException calculator;
    //kazda metoda ma do tego dostep

 @BeforeAll //uruchomi sie raz przed wszystkimi dlatego musi
 //byc statycna
 static void init (){
     calculator=new CalculatorWithException();
 }

    @Test
    void shouldDivideTwoValue() {
        //given -inicjacja wszystkiego do testu
        int expectedResult=2;
        //#1 opcja
                 //CalculatorWithException calculator=new CalculatorWithException();
                //metoda nie jest statyczna wiec trzeba stworzyc obiekt
        //when
        int result = calculator.divide(6, 3);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void  shouldThrowExpectionIfSecondNumberEquals0(){
//specjalne asercie do wyjatkow
    //junit5
    assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(2, 0),
            "Cannot divide by 0DDDD"); //oczekuje aby
        //wyrzucil taki message a go nie ma i rzuca wyjatkiem

        //assertj
        assertThatThrownBy(
                ()-> calculator.divide(2, 0))
                .hasMessage("Cannot divide by 0")
                .isInstanceOf(ArithmeticException.class);    //do sprawdzenia typow

    }
    //-------------------------------
}