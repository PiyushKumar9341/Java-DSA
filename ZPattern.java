public class ZPattern {
    public static void main(String[] args) {
        
        int size = 5; 

        
        for (int i = 0; i < size; i++) {
            // Inner loop columns
            for (int j = 0; j < size; j++) {
                
                
                if (i == 0 || i == size - 1) {
                    System.out.print("*");
                }
                
                
                else if (i + j == size - 1) {
                    System.out.print("*");
                }
                
                // Print a space for all other position
                else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}