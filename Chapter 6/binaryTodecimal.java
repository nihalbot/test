import java.lang.Math;
public class binaryTodecimal {
    public static void binaryTodeci(long number){
        long decimal = 0;
        long last_digit = 0;

        for(int i = 0; number > 0; i++)
        {
            last_digit = (number % 10);
            decimal += (Math.pow(2, i)) * last_digit ;
            
            number = number / 10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        binaryTodeci(1000000001);
    }
}
