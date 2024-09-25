public class decimalTobinary {
    public static void deciTobi(int decimal){
        int lastDigit = 0;
        int newNumber = 0;
        for(int i = 0; decimal > 0; i++){
            lastDigit = (decimal % 2);
            newNumber = newNumber + (lastDigit * (int)Math.pow(10,i));
            decimal = (decimal / 2);  
        }
        // int rev = 0;
        // int last_digit = 0;
        // for(int i = 1; newNumber > 0; i++){
        //     last_digit = (newNumber % 10);
        //     rev = ((rev * 10) + last_digit);
        //     newNumber = newNumber / 10;
        // }
        System.out.println(newNumber);
    }
    public static void main(String[] args) {
        deciTobi(11);
    }
}
