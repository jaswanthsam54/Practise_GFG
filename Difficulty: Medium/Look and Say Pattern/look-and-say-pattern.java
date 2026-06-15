class Solution {
    public String countAndSay(int n) {
        // Base case: the 1st row is always "1"
        if (n <= 0) return "";
        String result = "1";
        
        // Iteratively generate rows from 2 to n
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count).append(result.charAt(j - 1));
                    count = 1; // Reset count for the new character
                }
            }
            // Append the last group of characters
            sb.append(count).append(result.charAt(result.length() - 1));
            
            // Move to the next sequence
            result = sb.toString();
        }
        
        return result;
    }
}