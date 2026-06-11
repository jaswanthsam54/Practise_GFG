class Solution {
    public static boolean pallan(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            sum += digit;
            sb.append((char) ('a' + digit));
        }
        
        String pattern = sb.toString();
        int len = pattern.length();
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sum; i++) {
            result.append(pattern.charAt(i % len));
        }
        
        String finalStr = result.toString();
        int left = 0;
        int right = finalStr.length() - 1;
        
        while (left < right) {
            if (finalStr.charAt(left) != finalStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}