class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushatbottom(st,top);
    }
    public static void pushatbottom(Stack<Integer> st,int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        pushatbottom(st,val);
        st.push(top);
    }
}
