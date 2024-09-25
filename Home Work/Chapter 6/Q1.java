import java.util.*;
public class Q1 {
    public static float calculateAvarage(float num1, float num2, float num3){
        return ((num1 + num2 + num3) / 3.0f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter another number : ");
        float num2 = sc.nextFloat();
        System.out.print("Enter another number  : ");
        float num3 = sc.nextFloat();

        float result = calculateAvarage(num1, num2, num3);

        System.out.println("Avarage of three number is : " + result);
    }
}
