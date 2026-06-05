// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        if (arr.length == 3) {
            return arr[1];
        }
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2 ;
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        return arr[lo];
    }
}