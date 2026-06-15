import java.util.ArrayList;

class Solution {
    // Added 'int n' to match what the GfG driver code is passing
    public int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr, int n) {
        int max_len = 0;
        for (ArrayList<Integer> row : arr) {
            if (row.size() > max_len) {
                max_len = row.size();
            }
        }
        
        int minSum = Integer.MAX_VALUE;
        
        for (int col = 0; col < max_len; col++) {
            int currentVerticalSum = 0;
            
            for (int row = 0; row < arr.size(); row++) {
                if (col < arr.get(row).size()) {
                    currentVerticalSum += arr.get(row).get(col);
                }
            }
            
            if (currentVerticalSum < minSum) {
                minSum = currentVerticalSum;
            }
        }
        
        return minSum;
    }
}