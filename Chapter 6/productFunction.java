import java.util.*;

public class productFunction {
    public static int productCalculation(int num1, int num2) {
        return (num1 * num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number : ");
        int num2 = sc.nextInt();

        System.out.println("Product of two number is : " + productCalculation(num1, num2));
        
    }
}
