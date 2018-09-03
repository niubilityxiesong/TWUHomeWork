import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsExercise {
    public static void generate(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                number = number / i;
                result.add(i);
            }
        }
        System.out.println(result);
    }
}