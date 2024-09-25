import java.util.*;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Which number factorial you want : ");
        int number = sc.nextInt();

        int factorial = 1;
        
        for(int i = 2; i <= number; i++)
        {
            factorial *= i;
        }

        System.out.println("Factorial of " + "is : " + factorial);
    }
}
