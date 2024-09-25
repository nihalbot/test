import java.util.*;

public class if_else {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you age : ");
        int age = sc.nextInt();

        if(age >= 18 && age <= 100)
        {
            System.out.println("Your age is : " + age + " You Can Vote!");
        }

        else
        {
            System.out.println("Your  age is : " + age + " You can't Vote");
        }
    }
}
