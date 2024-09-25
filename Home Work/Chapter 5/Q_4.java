import java.util.*;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Whuch number tabel you want : ");
        int number = sc.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(number + "x" + i + "= " + (number*i));
        }
    }
}
