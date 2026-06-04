class Solution {
    public int findMagicalNumber(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == mid) {
                result = mid;       // Record the magical number
                high = mid - 1;     // Look left for an even smaller index
            } 
            else if (arr[mid] < mid) {
                low = mid + 1;      // Look right
            } 
            else {
                high = mid - 1;     // Look left
            }
        }

        return result;
    }
}