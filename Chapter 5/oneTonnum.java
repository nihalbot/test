import java.util.*;

public class oneTonnum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to print : ");
        int limit = sc.nextInt();
        int counter = 0;

        while(counter < limit)
        {
            System.out.print((counter+1) + " ");
            counter++;
        }
    }
}
