package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

public class StringUtilWithParameterized {

    public static boolean isBlank(String input) {
       //tu implementacje metody po tym jak
        // void shouldReturnTrueIfInputIsNotEmpty(String input)
        //wyszło failed
        return input ==null ||input.trim().isEmpty();
    }
}