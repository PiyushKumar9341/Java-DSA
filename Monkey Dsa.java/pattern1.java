public class pattern1 {
    public static void main(String[] args) {
        int height = 9; // Total number of rows

        for (int i = 1; i <= height; i++) {
            
            // First, we need to push the stars to the right to form the triangle shape.
            // Each row gets one less space than the row above it.
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Now we handle the stars and the hollow center
            for (int k = 1; k <= (2 * i - 1); k++) {
                
                // We only want stars on the very first row (the tip),
                // the very last row (the base), and the edges of the middle rows.
                if (i == 1 || i == height || k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    // This creates the "empty" space inside the triangle
                    System.out.print(" ");
                }
            }

            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}