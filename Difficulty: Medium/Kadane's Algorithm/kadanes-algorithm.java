class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int cs = arr[0];
        int ms = arr[0];
        int n = arr.length;
        for (int i = 1 ; i < n ; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs,ms);
        }
        return ms;
    }
}
