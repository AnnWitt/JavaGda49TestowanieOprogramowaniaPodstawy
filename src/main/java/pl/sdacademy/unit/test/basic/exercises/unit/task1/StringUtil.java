package pl.sdacademy.unit.test.basic.exercises.unit.task1;

public class StringUtil {

    public static boolean isBlank(String input) {
        return input == null ||
                input.trim().isEmpty();

        //albo null albo zostaje puste - to true
    }
}