import java.util.*;
public class countZeroOne {
    public static void countZeroone(int number[]){
        int zeroCounter = 0;
        int oneCounter = 0;

        for(int i = 0; i < number.length; i++){
            if(number[i] == 0){
                zeroCounter++;
            }
            else if (number[i] == 1){
                oneCounter++;
            }
        }
        System.out.println("Total zero in this array : " + zeroCounter);
        System.out.println("Total one in this array : " + oneCounter);
    }
    public static void main(String[] args) {
        int number[] = {0, 0, 1, 0, 1, 1, 1, 0, 0};

        countZeroone(number);
    }
}
