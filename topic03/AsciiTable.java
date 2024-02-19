public class AsciiTable {
    public static void main(String[] args) {
        System.out.printf("%5s %5s %5s %5s%n", "Dec", "Oct", "Hex", "Char");

        for (int i = 1; i <= 127; i++) {
            System.out.printf("%1$5d %1$5o %1$5x %1$5c\n", i);
        }
    }
}
