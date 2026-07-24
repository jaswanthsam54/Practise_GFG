class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> q2=new LinkedList<>();
        int size=q.size()/2;
        for(int i=0;i<size;i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}
