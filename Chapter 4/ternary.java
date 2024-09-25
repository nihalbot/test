import java.util.*;

public class ternary {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "EVEN":"ODD";

        System.out.println("The number is " + result);
    }
}
