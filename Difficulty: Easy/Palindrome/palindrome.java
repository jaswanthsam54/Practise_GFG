class Solution {
    public boolean isPalindrome(int n) {
        // code here
        if (n < 0) {
            return false ;
        }
        int copyn = n;
        int rev = 0 ;
        while (n > 0 ) {
            int digit = n % 10;
            rev = (rev * 10) + digit ;
            n = n / 10 ;
        }
        return copyn == rev  ;
    }
}