public class pattern41 {
    public static void main(String[] args) {
        int n = 9; // Number of columns
        int rows = 3; // The height shown in the image

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= n; j++) {
                
                // This logic matches the specific 'V' shape in your picture:
                // Row 1 stars: 1, 5, 9 (Distance of 4)
                // Row 2 stars: 2, 4, 6, 8 (Even columns)
                // Row 3 stars: 3, 7 (Distance of 4, offset by 2)
                
                if (((i + j) % 4 == 2) || (i == 2 && j % 2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}