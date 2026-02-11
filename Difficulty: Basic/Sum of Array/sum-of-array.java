// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        // code here
        int n = arr.length;
        int count = 0;
        for (int i = 0 ; i < n ; i++){
            count = count + arr[i];
        }
        return count;
    }
}
