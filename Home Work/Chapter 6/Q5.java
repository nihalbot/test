import java.util.*;
public class Q5 {
    public static int sum(int number){
        int sum = 0;
        int last_digit = 0;
        for(int i = 1; number > 0; i++){
            last_digit = (number % 10);
            sum += last_digit;
            number = (number / 10);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int storeNum = sc.nextInt();

        System.out.println("Sum of " + storeNum + " All digit is : " + sum(storeNum));
    }
}
