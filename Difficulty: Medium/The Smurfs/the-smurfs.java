class Solution {
    public int findMin(char[] arr) {
        int r = 0, g = 0, b = 0;
        
        // Count the occurrences of each color
        for (char ch : arr) {
            if (ch == 'R') r++;
            else if (ch == 'G') g++;
            else if (ch == 'B') b++;
        }
        
        // Case 1: If all smurfs are of the same color, no operations can be done
        if (r == arr.length || g == arr.length || b == arr.length) {
            return arr.length;
        }
        
        // Case 2: If all counts have the same parity (either all even or all odd)
        if ((r % 2 == g % 2) && (g % 2 == b % 2)) {
            return 2;
        }
        
        // Case 3: Mixed parities
        return 1;
    }
}