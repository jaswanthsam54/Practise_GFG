class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        if (k > n || k <= 0) {
            return 0;
        }
        int[] pre = new int[n+1];
        pre[0] = 0;
        for (int i = 0 ; i < n ; i++){
            pre[i + 1] = pre[i] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i <= n - k ; i++){
            int cs = pre[i + k] - pre[i];
            max = Math.max(max,cs);
        }
        return max;
    }
}