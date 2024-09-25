public class revarseArray {
    public static void swap(int number[]){
        int temp;
        for(int i = 0; (i < number.length / 2); i++){
            int index = number.length - 1;
            temp = number[i];
            number[i] = number[index-i];
            number[index-i] = temp;
        }
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 11};

        swap(number);
        
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}
