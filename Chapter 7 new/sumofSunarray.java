public class sumofSunarray {
    public static void sumOfsubArr(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            System.out.println(sum);
        }
        System.out.println("Sum of the sub array:" + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        sumOfsubArr(number);
    }
}
