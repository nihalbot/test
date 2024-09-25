import java.util.*;

public class arithmathic_operator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter value of b = ");
        int b = sc.nextInt();

        System.out.println("Addition of a + b = " + (a + b));
        System.out.println("Substruction of a - b = " + (a - b));
        System.out.println("Multiplicatoion of a * b = " + (a * b));
        System.out.println("Division of a / b = " + (b / a));
        System.out.println("Reminder of a % b = " + (a % b));
        
    }
}
