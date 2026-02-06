import java.util.Arrays;

class Solution {
    
    public int mean(int[] arr) {
        int n = arr.length;
        long sum = 0; // Use long to prevent overflow during
        
        for (int num : arr) {
            sum += num;
        }
        
        // Integer division in Java automatically performs the floor operation
        return (int) (sum / n);
    }

    public int median(int[] arr) {
        int n = arr.length;
        
        // Step 1: Sort the array (Median requires a sorted dataset)
        Arrays.sort(arr);
        
        if (n % 2 != 0) {
            // Case 1: Odd number of elements
            // The middle element is at index n/2
            return arr[n / 2];
        } else {
            // Case 2: Even number of elements
            // Median is floor average ofelements at indices (n/2)-1 and n/2
            int mid1 = arr[(n / 2) - 1];
            int mid2 = arr[n / 2];
            return (mid1 + mid2) / 2;
        }
    }
}