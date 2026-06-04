class Solution {
    public static int[] fibonacciNumbers(int n) {
        int[] result = new int[n];
        
        if (n >= 1) {
            result[0] = 0;
        }
        if (n >= 2) {
            result[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        
        return result;
    }
}