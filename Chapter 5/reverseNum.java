import java.util.*;

public class reverseNum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number you want to reverse : ");
        int number = sc.nextInt();

        for(int i = 1; number > 0; i++)
        {
            int last_digit = number % 10;
            System.out.print(last_digit + " ");
            number = number / 10;
        }
    }
}
