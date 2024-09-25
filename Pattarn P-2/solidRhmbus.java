public class solidRhmbus {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row <= n; row = row + 1){
            //print space
            for(int col = 1; col <= (n - row); col = col + 1){
                System.out.print(" ");
            }
            for(int col = 1; col <= n; col = col + 1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
