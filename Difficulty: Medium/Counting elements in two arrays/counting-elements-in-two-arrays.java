import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(b);
        
        for (int i = 0; i < a.length; i++) {
            int count = findUpperBound(b, a[i]);
            result.add(count);
        }
        
        return result;
    }
    
    private static int findUpperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int index = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] <= target) {
                index = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return index;
    }
}