public class pattern8 {
    public static void main(String[] args) {
        int n = 5; // Total size

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Condition 1: i == j (The diagonal from top-left to bottom-right)
                // Condition 2: i + j == n + 1 (The diagonal from top-right to bottom-left)
                if (i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}