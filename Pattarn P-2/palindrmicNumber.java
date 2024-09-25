public class palindrmicNumber {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row = row + 1){
            //space
            for(int space = 1; space <= n-row; space = space + 1){
                System.out.print(" ");
            }
            //print number decressing order
            for(int num = 1; num <= row; num = num + 1){
                System.out.print(row+1 - num);
            }
            //print number incressing order
            for(int num2 = 2; num2 <= row; num2 = num2 + 1){
                System.out.print(num2);
            }
            System.out.println();
        }
    }
}
