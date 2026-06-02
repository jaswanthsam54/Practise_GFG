class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int lo = 0;
        int hi = arr.length - 1 ;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == k){
                result = mid;
                hi = mid - 1;
            }
            else if (arr[mid] < k) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return result;
    }
}