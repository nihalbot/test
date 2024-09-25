public class extream {
    public static void findExtream(int number[]){
        int length = number.length - 1;
        for(int i = 0; i < number.length-1; i++){
            if(i > length){
                break;
            }
            if(i == length){
                System.out.println(number[i]);
            }
            else{
                 System.out.println((number[i]) + " -> " + (number[length]) + " "); 
            }
            length--; 
             
        }
    }
    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50, 60, 70, 80};

        findExtream(number);
    }
}
