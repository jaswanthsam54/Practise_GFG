import java.util.Arrays;

class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        
        int n = stalls.length;
        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canPlaceCows(stalls, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
    
    private boolean canPlaceCows(int[] stalls, int k, int dist) {
        int cowCount = 1;
        int lastPlacedPosition = stalls[0];
        
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlacedPosition >= dist) {
                cowCount++;
                lastPlacedPosition = stalls[i];
                
                if (cowCount >= k) {
                    return true;
                }
            }
        }
        
        return false;
    }
}