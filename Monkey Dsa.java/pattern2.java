public class pattern2 {
    public static void main(String[] args) {
        int n = 4;

        // Part 1: The Top Half (Rows 1 to 4)
        for (int i = 1; i <= n; i++) {
            
            // Add leading spaces to keep things centered
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Count UP from 1 to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Count DOWN from the number just before the peak
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Part 2: The Bottom Half (Rows 3 down to 1)
        // We start at n-1 because the middle row was already printed above
        for (int i = n - 1; i >= 1; i--) {
            
            // Same space logic as above
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Count UP again
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Count DOWN again
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}