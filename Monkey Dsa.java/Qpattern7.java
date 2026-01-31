public class Qpattern7 {
    public static void main(String[] args) {
        int n = 4;

        // Top half and middle row
        for (int i = 1; i <= n; i++) {
            // Printing leading spaces
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            
            // Numbers counting up
            for (int j = 1; j <= i; j++) System.out.print(j);
            
            // Numbers counting down
            for (int j = i - 1; j >= 1; j--) System.out.print(j);
            
            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = i - 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }
}