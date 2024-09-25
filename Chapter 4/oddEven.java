import java.util.*;

public class oddEven {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int storeNumber = sc.nextInt();

        if(storeNumber % 2 == 0)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is a ODD");
        }
    }
}
