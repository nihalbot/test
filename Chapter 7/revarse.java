import java.util.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
public class revarse {
    public static void rev(int number[]){
        int end = number.length - 1;
        int copy[] = new int[end+1];

        //copy data
        for(int i = 0; i < number.length; i++){
            copy[i] = number[i];
        }
        //revarse value
        for(int i = 0; i < number.length; i++){
                number[i] = copy[end];
                end--;
        }
        //print reverse value
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
    public static void main(String[] args) {
        int number[] = { 10, 20, 30, 40, 50, 60, 50, 46};
        rev(number);
    }
}
