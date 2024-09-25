import java.util.*;
public class facrotialN {
    public static int calFactorial(int number){
        int fact = number;

        for(int i = 1; i < number; i++)
        {
            fact *=  (number - i); //logic number * (number-i)
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number(positive number only) : ");
        int number = sc.nextInt();

        if(number > 0)
        {
            System.out.println("Factioal of " + number + " is : " + calFactorial(number));
        }else{
            System.out.println("Enter positive number and try again.");
        }
    }
}
