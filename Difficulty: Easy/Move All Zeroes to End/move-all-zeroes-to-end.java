class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int s=0;
        for(int f=0;f<arr.length;f++){
            if(arr[f]!=0){
                int temp = arr[s];
                arr[s] = arr[f];
                arr[f] = temp;
                s++;
            }
        }
    }
}