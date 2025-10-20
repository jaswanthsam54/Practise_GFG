class Solution {

    public int findK(int a[][], int n, int m, int k) {
        int strow = 0, endrow = n - 1;
        int stcol = 0, endcol = m - 1;
        int count = 0; // count elements while traversing
        
        while (strow <= endrow && stcol <= endcol) {
            // Top row
            for (int j = stcol; j <= endcol; j++) {
                count++;
                if (count == k) return a[strow][j];
            }
            
            // Right column
            for (int i = strow + 1; i <= endrow; i++) {
                count++;
                if (count == k) return a[i][endcol];
            }
            
            // Bottom row
            if (strow < endrow) { // avoid double counting
                for (int j = endcol - 1; j >= stcol; j--) {
                    count++;
                    if (count == k) return a[endrow][j];
                }
            }
            
            // Left column
            if (stcol < endcol) { // avoid double counting
                for (int i = endrow - 1; i > strow; i--) {
                    count++;
                    if (count == k) return a[i][stcol];
                }
            }
            
            strow++;
            endrow--;
            stcol++;
            endcol--;
        }
        
        return -1; // if k is invalid
    }
}
