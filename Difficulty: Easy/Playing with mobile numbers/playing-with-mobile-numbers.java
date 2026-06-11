class Solution {
    public int is_valid(String s) {
        int n = s.length();
        
        if (n == 10) {
            char first = s.charAt(0);
            if (first == '7' || first == '8' || first == '9') {
                return 1;
            }
        } else if (n == 11) {
            if (s.charAt(0) == '0') {
                char second = s.charAt(1);
                if (second == '7' || second == '8' || second == '9') {
                    return 1;
                }
            }
        } else if (n == 12) {
            if (s.startsWith("91")) {
                char third = s.charAt(2);
                if (third == '7' || third == '8' || third == '9') {
                    return 1;
                }
            }
        }
        
        return 0;
    }
}