class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return s.equals(rev);
    }
}