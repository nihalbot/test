import java.util.*;

public class Q_2 {
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to enter : ");
        int limit = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1; i <= limit; i++)
        {
            int temp;

            System.out.print("Enter number : ");
            temp = sc.nextInt();

            if(temp % 2 == 0)
            {
                evenSum += temp;
            }
            else
            {
                oddSum += temp;
            }
        }
        System.out.println("Sum of even number : " + evenSum);
        System.out.println("Sum of odd number : " + oddSum);
   } 
}
