class Solution {
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;
        int leftSum = 0;
        
        // Step 1: Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }
        
        // Step 2: Iterate through the array to find the equilibrium point
        for (int i = 0; i < arr.length; i++) {
            // totalSum now acts as the rightSum for index i
            totalSum -= arr[i]; 
            
            // If left sum matches right sum, we found the equilibrium index
            if (leftSum == totalSum) {
                return i;
            }
            
            // Update left sum for the next iteration
            leftSum += arr[i];
        }
        
        // Return -1 if no equilibrium point is found
        return -1;
    }
}