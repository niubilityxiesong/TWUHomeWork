public class DiamondWithName {
    public static void diamondWithName(int number) {
        int horizontal = number * 2 - 1;
        int middle = horizontal / 2;
        for (int i = 0; i < number; i++) {
            if (i == middle) {
                System.out.println("Bill");
                continue;
            }
            for (int j = 0; j < horizontal; j++) {
                if ((i + j) >= middle && j <= middle + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        Diamond.anotherDiamond(number, horizontal, middle);
    }
}
