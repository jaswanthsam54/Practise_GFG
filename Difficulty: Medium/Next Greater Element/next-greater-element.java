class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(-1);
        }
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1 ; i >= 0 ; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i] ){
                s.pop();
            }
            if (!s.isEmpty()){
                a.set(i,arr[s.peek()]);
            }
            s.push(i);
        }
        return a;
    }
}