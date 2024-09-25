public class hollowRhombus {
    public static void main(String[] args) {
        int n = 20;

        for (int row = 1; row <= n; row = row + 1) {
            for (int col = 1; col <= n - row; col = col + 1) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n; col = col + 1) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
