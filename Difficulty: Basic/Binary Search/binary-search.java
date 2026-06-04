class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == k){
                return true;
            }
            else if (arr[mid] < k) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return false;
    }
}