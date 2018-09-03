import java.lang.reflect.Array;
import java.util.Arrays;

public class IsoscelesTriangle {
    public static void isoscelesTriangle(int number) {
        int horizontal = number * 2 - 1;
        int middle = horizontal / 2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < horizontal; j++) {
                if ((i + j) >= middle && j <= middle + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
