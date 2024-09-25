import java.util.*;
public class minNum {
    public static void findMinnum(int number[]){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < number.length; i++){
            if(number[i] < min){
                min = number[i];
            }
        }
        System.out.println("Minimum number : " + min);
    }
    public static void main(String[] args) {
        int number[] = { 2, 5, 4, 1, 94, 434, 57, 48};

        findMinnum(number);
    }
}
