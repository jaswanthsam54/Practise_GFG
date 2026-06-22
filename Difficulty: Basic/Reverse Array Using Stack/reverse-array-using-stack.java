class Solution {
    public void reverseArray(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> sk=new Stack<>();
        for(int i=0;i<n;i++){
            sk.push(arr[i]);
        }
         int i = 0;
        while (!sk.isEmpty()) {
            arr[i++] = sk.pop();
        }
        
    }
}
