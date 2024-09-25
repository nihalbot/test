import java.util.*;

public class rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many line you want : ");
        int line_limit = sc.nextInt();

        for(int i = 1; i <= line_limit; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
