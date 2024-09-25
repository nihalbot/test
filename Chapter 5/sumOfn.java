import java.util.*;

public class sumOfn {
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);

    System.out.print("How many number sum you want : ");
    int limit = sc.nextInt();
    int counter = 1;
    int sum = 0;
    
    while(counter <= limit)
    {
        sum += counter;
        counter++;
    }

    System.out.println("Sum of " + limit + "number is :" + sum);
   } 
}
