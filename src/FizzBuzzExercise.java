import java.util.Arrays;

public class FizzBuzzExercise {
    public static void fizzBuzzExercise(int number) {
        for (int i = 1; i <= number; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "BuZZ";
            }
            if (result.length() == 0) {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }

}
