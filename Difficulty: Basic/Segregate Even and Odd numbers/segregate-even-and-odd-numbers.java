import java.util.Arrays;

class Solution {
    void segregateEvenOdd(int arr[]) {
        // Step 1: Sort the array to ensure ascending order for both groups
        Arrays.sort(arr);
        
        int n = arr.length;
        int[] temp = new int[n];
        
        // 's' is the slow pointer (tracks where to write the next element in temp)
        int s = 0; 
        
        // Step 2: First pass - Fast pointer 'f' finds and copies all EVENS
        for (int f = 0; f < n; f++) {
            if (arr[f] % 2 == 0) {
                temp[s] = arr[f];
                s++; // move slow pointer forward
            }
        }
        
        // Step 3: Second pass - Fast pointer 'f' resets and copies all ODDS
        for (int f = 0; f < n; f++) {
            if (arr[f] % 2 != 0) {
                temp[s] = arr[f];
                s++; // move slow pointer forward
            }
        }
        
        // Step 4: Copy the structured elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}