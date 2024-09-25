import java.util.*;

public class multipleOften {
   public static void main(String arsg[])
   {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter your number : ");
            int number = sc.nextInt();

            if(number % 10 == 0)
            {
                //System.out.println("You entred multiple of 10");
                continue;
            }
            System.out.println("Your entred number is : " + number);
        }while(true);
   } 
}
