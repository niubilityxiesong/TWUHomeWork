public class DrawRightTriangle {
    public static void rightTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = number - i - 1; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
