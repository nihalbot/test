public class holo {
    public static void main(String[] args) {
        int n = 4;

        for(int row = 1; row <= n; row = row + 1){
            //print star and space
            for(int col = 1; col <= n+1; col = col + 1){
                if(row == 1 || row == n || col == 1 || col == n+1){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
