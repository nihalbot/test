import java.util.*;
public class Q2{
    public static boolean isEven(int number){
        boolean result;

        if(number % 2 == 0)
        {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();

        System.out.println(isEven(num1));

    }
}