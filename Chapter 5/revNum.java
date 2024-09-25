import java.util.*;

public class revNum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int rev = 0;
        int last_digit = 0;

        System.out.println("Your given number is : " + number);

        for(int i = 1; number > 0; )
        {
            last_digit = (number % 10);
            rev = ((rev * 10) + last_digit);
            number = (number / 10);
        }

        System.out.println("Your reverse number is : " + rev);
    }
}
