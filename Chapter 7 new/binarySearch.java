public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12 ,14};
        int n = 7;
        int start = 0;
        int end = n - 1;
        int key = 10;
        int index = 0;
         
        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == key){
                System.out.println("Found");
                index = mid;
                System.out.println(index);
                break;
            }
            else if(arr[mid] > key){
                start = 0;
                end = mid - 1;
                mid = (start + end) / 2;
            }
            else if(arr[mid] < key){
                start = mid + 1;
                end = n - 1;
                mid = (start + end) / 2;
            }
            // else{
            //     System.out.println("Not found!");
            // }
             
        }
    }
}
