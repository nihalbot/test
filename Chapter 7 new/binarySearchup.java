public class binarySearchup {
    public static int binary(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (key == arr[mid]) {
                return 1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        int result = binary(arr, key);

        if(result >= 1){
            System.out.println("Found");
        }else{
            System.out.println("Not Found!");
        }
        

    }
}
