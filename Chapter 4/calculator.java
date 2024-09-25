import java.util.*;

public class calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();
        System.out.print("Enter a operation symbol : ");
        char operator = sc.next().charAt(0);

        switch(operator)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '/':
                System.out.print(a/b);
                break;
            default:
                System.out.print("Enter a valid operator!");
        }
    }
}
