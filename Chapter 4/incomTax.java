import java.util.*;

public class incomTax {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        float tax;

        System.out.print("Enter your Income : ");
        float income = sc.nextFloat();

        if(income < 500000)
        {
            System.out.println("You are in TAX free region");
            System.out.println("Thanks for inqurying");
        }
        else if(income >= 500000 && income < 1000000)
        {
            tax = (income + (income * 0.2f));
            tax = tax - income;
            System.out.println("Your are in 20% TAX region");
            System.out.println("Your payable tax is : " + tax);
        }
        else if(income >= 1000000)
        {
            tax = (income + (income * 0.3f));
            tax = tax - income;
            System.out.println("You are in 30% TAX region");
            System.out.println("Your payable tax is : " + tax);
        }
    }
}
