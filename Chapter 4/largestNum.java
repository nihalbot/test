import java.util.*;

public class largestNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of a : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is gratter than b");
        }

        if (b > a) {
            System.out.println("b is gratter than a");
        }

        else 
        {
            System.out.println("Both are equal number");
        }

    }
}
