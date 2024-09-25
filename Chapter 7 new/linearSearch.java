public class linearSearch {
    public static int search(int data[], int key){
        for(int i = 0; i < data.length; i++){
            if(data[i] == key){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int data[] = {2, 4 ,6, 8, 101, 12, 14, 16, 18};
        int key = 101;

        int index = search(data, key);

        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index " + index);
        }
    }
}
