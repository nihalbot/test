import java.util.*;

public class input{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();

        int sum = (a + b);

        System.out.print("Sum of two number is : ");
        System.out.println(sum);
    }
}