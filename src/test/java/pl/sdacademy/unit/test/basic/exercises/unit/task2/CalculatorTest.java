package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void IsAddInRange() {
        //given
        int input=3; //suma
        boolean expectedResult=true;
        //when //ranges from -32,768 to +32,767
        boolean result= input>-32768 && input<32767;
        //then
        assertTrue(result);
    } //pomysl

    @Test
    void IsAddCalcCorrect() {
        //given
        int firstDigit=3;
        int secondDigit=6;
        int expectedResult=9;
        //when
        Calculator calculator=new Calculator();
        int result = calculator.add(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result);



    }


    //--------------------
/*    @Test
    void subtract() {
    }*/

/*    @Test
    void multiply() {
    }*/

/*    @Test
    void divide() {
    }*/
}