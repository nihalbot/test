import java.util.*;

public class largestThreenum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("a is bigger number");
        }
        else if (b >= c) {
            System.out.println("b is bigger number");
        }
        else
        {
            System.out.println("c is biggest number");
        }
    }
}
