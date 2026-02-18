
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        int n = arr.length;
        if (n < 2) return false;

        Arrays.sort(arr);

        int i = 0;
        int j = 1;

        while (i < n && j < n) {

            if (i == j) {
                j++;
                continue;
            }

            int diff = arr[j] - arr[i];

            if (diff == x) {
                return true;
            }
            else if (diff < x) {
                j++;
            }
            else {
                i++;
            }
        }

        return false;
    }
}
