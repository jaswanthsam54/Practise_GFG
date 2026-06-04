// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        int lo = 0;
        int hi = arr.length - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (arr[mid] == 1){
                result = mid;
                hi = mid - 1;
            }
            else if (arr[mid] < 1){
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return result;
    }
}