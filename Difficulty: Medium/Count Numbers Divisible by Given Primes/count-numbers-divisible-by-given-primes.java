class Solution {
    public int countDivisible(int[] arr, int m) {
        int n = arr.length;
        int totalCount = 0;
        
        // Number of possible subsets is 2^n
        int totalSubsets = 1 << n;
        
        // Loop from 1 to (2^n - 1) to check every non-empty subset
        for (int i = 1; i < totalSubsets; i++) {
            long product = 1;
            int elementCount = 0;
            boolean overflow = false;
            
            for (int j = 0; j < n; j++) {
                // Check if the j-th element is included in the current subset bitmask
                if ((i & (1 << j)) != 0) {
                    elementCount++;
                    product *= arr[j];
                    
                    // Early pruning: if product exceeds m, its division contribution will be 0
                    if (product > m) {
                        overflow = true;
                        break;
                    }
                }
            }
            
            if (!overflow) {
                int divisibleCount = m / (int) product;
                
                // Inclusion-Exclusion Principle:
                // Odd number of elements -> Add to total
                // Even number of elements -> Subtract from total
                if (elementCount % 2 == 1) {
                    totalCount += divisibleCount;
                } else {
                    totalCount -= divisibleCount;
                }
            }
        }
        
        return totalCount;
    }
}