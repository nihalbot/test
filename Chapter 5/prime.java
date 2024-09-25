import java.util.*;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number you want to cheek : ");
        int number = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
                
            }
        }
        if (counter == 2) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a Prime Number");
            }
    }
}
