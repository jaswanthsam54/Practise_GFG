class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> sp = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        sp.add(1);
        s.push(0);
        for (int i = 1 ; i < arr.length ; i++) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()] ){
                s.pop();
            }
            if (s.isEmpty()){
                sp.add(i + 1);
            }
            else {
                int prevhigh = s.peek();
                sp.add(i - prevhigh);
            }
            s.push(i);
        }
        return sp;
        
    }
}