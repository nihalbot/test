public class numberPyramid {
    public static void main(String[] args) {
        int n = 9;

        for(int row = 1; row <= n; row = row + 1){
            //space
            for(int space = 1; space <= (n - row); space = space + 1){
                System.out.print(" ");
            }
            //print star
            for(int star = 1; star <= row; star = star + 1){
                System.out.print(row +" ");
            }
            System.out.println();
        }
    }
}
