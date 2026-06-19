class Solution {
    boolean isPalindrome(String s) {
        // code here
        int left = 0;
        int right = s.length() - 1;
        
        // Move pointers towards the center
        while (left < right) {
            // If characters at front and back don't match, it's not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}