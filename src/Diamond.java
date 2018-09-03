public class Diamond {
    public static void diamond(int number) {
        int horizontal = number * 2 - 1;
        int middle = horizontal / 2;
        IsoscelesTriangle.isoscelesTriangle(number);
        anotherDiamond(number, horizontal, middle);
    }

    public static void anotherDiamond(int number, int horizontal, int middle) {
        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < horizontal; j++) {
                if (j >= middle + i - 1 && j <= middle - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
