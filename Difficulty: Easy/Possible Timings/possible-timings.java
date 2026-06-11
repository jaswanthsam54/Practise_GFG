class Solution {
    static int numberOfPossibleTimings(String S) {
        // Map containing the number of possibilities for each digit from 0 to 9
        int[] possibilities = {2, 7, 2, 3, 3, 4, 2, 5, 1, 2};
        
        // Convert characters to their respective integer values
        int firstDigit = S.charAt(0) - '0';
        int secondDigit = S.charAt(1) - '0';
        
        // The total number of combinations is the product of both possibilities
        return possibilities[firstDigit] * possibilities[secondDigit];
    }
}