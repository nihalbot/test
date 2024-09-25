import java.util.*;

public class sumFunction {
    public static int calculateSum(int num1, int num2) {
        int sum = (num1 + num2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number : ");
        int num2 = sc.nextInt();

        int result = calculateSum(num1, num2);

        System.out.println("Sum of two number is : " + result);
    }
}
