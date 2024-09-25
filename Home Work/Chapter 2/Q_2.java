import java.util.*;

public class Q_2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of squre : ");
        float side = sc.nextInt();

        float area = (side * side);
        
        System.out.print("The area of a square : ");
        System.out.print(area);
    }
}
