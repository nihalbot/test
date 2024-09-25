import java.util.*;

public class areaOcircle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        float radius = sc.nextFloat();

        float area = (3.1416f * radius * radius);

        System.out.print("Area of a circle is : ");
        System.out.println(area);
    }
}
