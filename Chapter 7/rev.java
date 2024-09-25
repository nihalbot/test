public class rev {
    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50, 60};
        int end = (number.length - 1);

        for(int i = 0; i < number.length; i++){
            int temp = 0;
            if(i > end){
                break;
            }
            if(i == end){
                number[i] = number[i];
            }else{ 
                //copy value
                 temp = number[i];
                 number[i] = number[end];
                 number[end] = temp;
                 end--;
            }  
        }

        //print reverse array
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}
