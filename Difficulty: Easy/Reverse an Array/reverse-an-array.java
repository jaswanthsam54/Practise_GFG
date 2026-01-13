class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int first = 0 ;
        int last = arr.length-1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }
}