import java.util.*;

public class Q_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your body tempreture in Farnhite : ");
        float tempreture = sc.nextFloat();

        if (tempreture > 100.0f) {
            System.out.println("You have a FEVER.");
        } else {
            System.out.println("You tempreture is normal");
        }
    }
}
