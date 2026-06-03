class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int fo = first(arr,target);
        if (fo == -1) {
            return 0;
        }
        int lo = last(arr,target);
        int result = lo - fo + 1;
        return result;
    }
        public static int first(int [] arr , int target) {
            int lo = 0 ;
            int hi = arr.length - 1;
            int ans = -1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target) {
                    ans = mid;
                    hi = mid - 1;
                }
                else if (arr[mid] < target) {
                    lo = mid + 1;
                }
                else {
                    hi = mid - 1;
                }
            }
            return ans;
        }
        public static int last(int [] arr , int target ) {
            int lo = 0 ;
            int hi = arr.length - 1;
            int ans = -1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target) {
                    ans = mid;
                    lo = mid + 1;
                }
                else if (arr[mid] < target) {
                    lo = mid + 1;
                }
                else {
                    hi = mid - 1;
                }
            }
            return ans;
    }
}
