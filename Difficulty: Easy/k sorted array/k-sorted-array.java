import java.util.Arrays;

class Solution {
    static String isKSortedArray(int arr[], int n, int k) {

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < n; i++) {
            int pos = Arrays.binarySearch(sorted, arr[i]);

            if (Math.abs(i - pos) > k) {
                return "No";
            }
        }

        return "Yes";
    }
}