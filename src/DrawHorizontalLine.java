public class DrawHorizontalLine {
    public static void horizontalLine(int number) {
        String s = new String();
        for (int i = 0; i < number; i++) {
            s += "*";
        }
        System.out.println(s);
    }
}
