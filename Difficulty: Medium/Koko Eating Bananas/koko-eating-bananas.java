class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        //Step 1 
        int lo = 1;
        int hi = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            hi = Math.max(hi,arr[i]);
        }
        int result = hi;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (check(arr,k,mid)) {
                result = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
            
        }
        return result;
        
    }
        // Step 2 
        public boolean check(int[] arr, int k, int speed){
            long hours = 0;
            for (int arr2 : arr) {
                hours += (arr2 + speed - 1 )/speed;
            }
            return hours <= k;
            
        }

        
    }
