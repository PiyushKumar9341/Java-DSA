public class pattern6 {
    public static void main(String[] args) {
        int n = 4;

        // TOP HALF (Rows 1 to 4)
        for (int i = 1; i <= n; i++) {
            // Put spaces on the left to center it
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Count up
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Count down starting from one less than the peak
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // BOTTOM HALF (Mirroring the top, excluding the center row)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}