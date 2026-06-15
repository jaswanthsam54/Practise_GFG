class Solution {
    public int findMin(int a, int b) {
        // Calculate the safe operations
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        
        // Find the minimum among the first three results
        int minVal = Math.min(add, Math.min(sub, mul));
        
        // Use exception handling to safely attempt division
        try {
            int div = a / b;
            minVal = Math.min(minVal, div);
        } catch (ArithmeticException e) {
            // Division by zero occurred; exclude it from consideration
        }
        
        return minVal;
    }
}