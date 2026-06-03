class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (arr[mid] >= target) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
