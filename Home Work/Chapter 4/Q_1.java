import java.util.*;

public class Q_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int storeNum = sc.nextInt();

        if(storeNum > 0)
        {
            System.out.println("The number is Positive");
        }
        else if(storeNum == 0)
        {
            System.out.println("The number is ZERO");
        }
        
        else{
            System.out.println("The Number is Negative");
        }
    }
}
