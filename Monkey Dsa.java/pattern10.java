public class pattern10 {
    public static void main(String[] args) {
        int n = 5; // Number of rows.

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                
                // If the sum of row index i and column index (j) is even..
                // it follows the pattern  shown in the image
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            // Move to the next line after each row is done.
            System.out.println();
        }
    }
}