class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == k){
                return mid;
            }
            else if (arr[mid] >= k){
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }
};