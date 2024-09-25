import java.util.*;

public class Q_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of Pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of Pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of Ereser : ");
        float ereser = sc.nextFloat();

        float total_prize_gst = (pencil + pen + ereser) + ((pencil + pen + ereser) * 0.18f);

        System.out.print("Total price after adding 18% GST : ");
        System.out.print(total_prize_gst);
    }
}
