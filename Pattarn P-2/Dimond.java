public class Dimond {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row = row + 1) {
            // print space
            for (int space = 1; space <= n - row; space = space + 1) {
                System.out.print(" ");
            }
            // print star
            for (int star = 1; star <= (2 * row - 1); star = star + 1) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd part
        for (int row = 1; row <= n; row = row + 1) {
            for (int space = 2; space <= row; space = space + 1) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * n - (2 * row - 1)); star = star + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
