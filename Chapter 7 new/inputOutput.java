import java.util.*;

public class inputOutput {
    public static void main(String[] args) {
        int arry[] = new int[10];
        float percentage;

        Scanner sc = new Scanner(System.in);

        arry[0] = 78;
        arry[1] = 93;
        arry[2] = 45;

        percentage = ((arry[0] + arry[1] + arry[2]) / 3.0f);

        System.out.println("Total Percentage of this arry is : " + percentage);
        System.out.println("length of this array : " + arry.length);
    }
}
