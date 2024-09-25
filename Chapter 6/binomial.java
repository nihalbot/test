import java.util.*;
public class binomial {
    public static int calFactorial(int number){
        int facto = number;

        for(int i = 1; i < number; i++){
            facto *= (number - i);
        }
        return facto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n : ");
        int storeN = sc.nextInt();
        System.out.print("Enter value of r : ");
        int storeR = sc.nextInt();

        int nMinusr = (storeN - storeR);

        // int nFact = calFactorial(storeN);
        // int rFact = calFactorial(storeR);
        // int nmrFacto = calFactorial(nMinusr);

        // int result = nFact / (rFact*nmrFacto);

        //System.out.println(result);
        if(nMinusr > 0)
        {
           System.out.println("Binomial Coefficient is : " + (calFactorial(storeN)) / ((calFactorial(storeR)) * (calFactorial(nMinusr))));
        }else{
           System.out.println("(n-r) is less than 0 so enter the correct info");
        }
        
    }
}
