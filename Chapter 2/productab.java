import java.util.*;

public class productab {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();

        int product = (a * b);

        System.out.print("Product of two number is : ");
        System.out.println(product);
    }
}
