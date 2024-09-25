public class butterFly {
    public static void main(String[] args) {
        int n = 10;
        
        for(int row = 1; row <= n; row++){
            //print star
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            //print space
            for(int col = 1; col <= (2*n)- (row*2); col++){
                System.out.print(" ");
            }
            //print star
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd part
        for(int row = 1; row <= n; row++){
            //print star
            for(int col = 1; col <= (n - row+1); col++){
                System.out.print("*");
            }

            //print space
            if(row == 1){
                System.out.print("");
            }
            else{ 
            for(int col = 1; col <= (2*row-2); col = col + 1){
                System.out.print(" " );
            }
        }

            //print star
            for(int col = 1; col <= (n - row + 1); col = col + 1){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
