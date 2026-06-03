// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
