
public class largestArray {
    public static int largeElement(int data[]){
        int max = 0;
        for(int i = 0; i < data.length - 1; i++){
            max = data[0];
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int data[] = {1, 40, 45, 23, 78, 34};

        System.out.print(largeElement(data));
    }
}
