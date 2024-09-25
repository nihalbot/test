public class paire {
    public static void pair(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < (number.length - 1 - i); j++) {
                int first, last;

                first = number[i];
                last = number[j + 1 + i];

                System.out.print("(" + first + "," + last + ")");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        pair(number);
    }
}
