public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) { // Outer loop for rows
            for (int j = 1; j <= 5; j++) { // Inner loop for columns
                if ((i == 1) || (i == 4)) { // Checks if it's the first or last row
                    System.out.print("* "); // Prints an asterisk and a space
                } else {
                    if (j == 1 || j == 5) { // Checks if it's the first or last column
                        System.out.print("* "); // Prints an asterisk
                    } else {
                        System.out.print("  "); // Prints a space
                    }
                }
            }
            System.out.println(); // Moves to the next line after printing each row
        }
    }
}
