
public class selection {
    public static void sortingArry(int array[]){
        for(int turn = 0; turn < array.length - 1; turn++){
            int minPosition = turn;
            for(int j = turn+1; j < array.length; j++){
                if(array[j] < array[minPosition]){
                    minPosition = j;
                }
            }
            //swap
            int temp;
            temp = array[minPosition];
            array[minPosition] = array[turn];
            array[turn] = temp;

        }
    }

    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {5, 4, 1, 3, 2};

        sortingArry(array);
        print(array);
    }
}
