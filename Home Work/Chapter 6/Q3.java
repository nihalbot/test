import java.util.*;

public class Q3 {
    public static void palindrom(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int temp = number;
        for (int i = 1; number > 0; i++) {
            lastDigit = (number % 10);
            reverse = ((reverse * 10) + lastDigit);
            number = (number / 10);
        }
        if (reverse == temp) {
            System.out.println(reverse + " Is a Palindrom number");
        }else{
            System.out.println(reverse + " Is not a Palindrom number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int storeNum = sc.nextInt();

        palindrom(storeNum);
    }
}
