class Solution {
    int search(int[] arr, int key) {
        // code here
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2 ;
            if (arr[mid] == key ){
                return mid;
            }
            else if (arr[lo] <= arr[mid]) {
                if (arr[lo] <= key && key < arr[mid]){
                    hi = mid - 1;
                }
                else {
                    lo = mid + 1;
                }
            }
                else {
                    if (arr[hi] >= key && key > arr[mid]){
                        lo = mid + 1;
                    }
                    else {
                        hi = mid - 1;
                    }
                }
        }
        return -1;
    }
}