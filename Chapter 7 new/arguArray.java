import java.util.*;
public class arguArray {
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);

        //taking input;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //passing array in a funcetion
        update(arr);
        
        //print output
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
