import java.util.*;
public class maxiMum {
    public static void maxiNum(int number[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < number.length; i++){
            if(number[i] > max){
                max = number[i];
            }
        }
        System.out.println("Maximum number in this array : " + max);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 1, 6, 8, 9, 0, 45, 70, 123};

        maxiNum(number);
    }
}
