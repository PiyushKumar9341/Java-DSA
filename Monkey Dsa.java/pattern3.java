public class pattern3 {
    public static void main(String[] args) {
        int n = 4; // This represents the height of one wing

        // PART 1: The Top Half
        for (int i = 1; i <= n; i++) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Central spaces (gets smaller as we go down)
            // The gap starts at 6 spaces and ends at 0
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // PART 2: The Bottom Half (Mirroring the top)
        for (int i = n; i >= 1; i--) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Central spaces (gets larger as we go down)
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}