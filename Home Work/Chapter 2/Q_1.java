import java.util.*;

public class Q_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int A = sc.nextInt();
        System.out.print("Enter first number : ");
        int B = sc.nextInt();
        System.out.print("Enter first number : ");
        int C = sc.nextInt();

        float avarage = (A + B + C) / 3.0f;

        System.out.print("Avarage of three number is : ");
        System.out.println(avarage);
    }
}
