import java.util.*;
import java.lang.Math;
public class decimalTobinary_BinaryTodecimal{
    public static void decimalTobinary(int decimal) {
        int deci = decimal;
        int lastDigit = 0;
        int newNumber = 0;
        for (int i = 1; decimal > 0; i++) {
            lastDigit = (decimal % 2);
            newNumber = (newNumber * 10) + lastDigit;
            decimal = (decimal / 2);
        }
        int rev = 0;
        int last_digit = 0;
        for (int i = 1; newNumber > 0; i++) {
            last_digit = (newNumber % 10);
            rev = ((rev * 10) + last_digit);
            newNumber = newNumber / 10;
        }
        System.out.println(deci + " Convert to Binary : " + rev);
    }

    public static void binaryTodeci(long number) {
        long num = number;
        long decimal = 0;
        long last_digit = 0;

        for (int i = 0; number > 0; i++) {
            last_digit = (number % 10);
            decimal += (Math.pow(2, i)) * last_digit;
            number = number / 10;
        }
        System.out.println(num + " To Decimal : " + decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 For Binary to Decimal Conversion");
        System.out.println("Enter 2 For Decimal to Binary Conversion");
        int decission = sc.nextInt();

        int number;

        if(decission == 1) {
            System.out.print("Enter your number : ");
            number = sc.nextInt();

            binaryTodeci(number);
        } 
        else if (decission == 2) {
            System.out.print("Enter your number : ");
            number = sc.nextInt();
            decimalTobinary(number);
        }else{
            System.out.println("Enter number between 1 and 2");
        }
    }
}
