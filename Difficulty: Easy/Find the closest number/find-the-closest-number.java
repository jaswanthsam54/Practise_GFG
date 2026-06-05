
class Solution {
    public static int findClosest(int[] arr, int k) {
        // code here
        if (arr.length == 1){
            return arr[0];
        }
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= k) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        if (lo == 0) {
            return arr[0];
        }
        int leftVal = arr[lo - 1];
        int rightVal = arr[lo];
        int diff1 = Math.abs(leftVal - k);
        int diff2 = Math.abs(rightVal - k);
        if (diff1 < diff2) {
            return leftVal;
        } else if (diff2 < diff1) {
            return rightVal;
        } else {
            return Math.max(leftVal, rightVal);
        }
    }
}
