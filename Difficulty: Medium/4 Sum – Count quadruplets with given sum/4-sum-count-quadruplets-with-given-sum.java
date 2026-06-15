import java.util.HashMap;

class Solution {
    public int countSum(int arr[], int target) {
        int n = arr.length;
        int count = 0;
        
        // Map to store the frequency of sums of pairs seen so far
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Maintain a dual-pointer system to split the quadruplet elements
        for (int i = 0; i < n - 1; i++) {
            // 1. Look ahead: treat arr[i] and arr[j] as the 3rd and 4th elements
            for (int j = i + 1; j < n; j++) {
                int currentSum = arr[i] + arr[j];
                int remainingSum = target - currentSum;
                
                // If the remaining sum exists in the map, add its frequency to the count
                if (map.containsKey(remainingSum)) {
                    count += map.get(remainingSum);
                }
            }
            
            // 2. Look behind: Add all pairs formed by arr[i] and previous elements (0 to i-1)
            // This ensures no index overlap happens between the two pairs.
            for (int k = 0; k < i; k++) {
                int pairSum = arr[k] + arr[i];
                map.put(pairSum, map.getOrDefault(pairSum, 0) + 1);
            }
        }
        
        return count;
    }
}