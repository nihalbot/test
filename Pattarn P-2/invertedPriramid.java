
public class invertedPriramid {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;

        for (int i = 1; i <= row; i++) {

            for (int space = 3; space >= i; space--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
