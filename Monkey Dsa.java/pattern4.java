public class pattern4 {
    public static void main(String[] args) {
        int n = 9; // Number of columns
        int rows = 3; // Fixed height as per the prompt

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= n; j++) {
                
                // This logic identifies the peaks and valleys:
                // 1. The sum of row and column is divisible by 4 (i + j) % 4 == 0
                // 2. Or, the row is 2 and the column is even (i == 2 && j % 4 == 0)
                // This covers the specific 3-row zig-zag wave.
                if (((i + j) % 4 == 0) || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    // Print a space if the condition isn't met
                    System.out.print(" ");
                }
            }
            // New line after each row
            System.out.println();
        }
    }
}