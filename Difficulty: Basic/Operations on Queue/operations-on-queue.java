class myQueue {
    Queue<Integer> q=new LinkedList<>();
    public myQueue() {
        // initialize your queue
    }

    public void enqueue(int x) {
        // insert x into queue
        q.offer(x);
    }

    public void dequeue() {
        // remove front element from queue
        if(!q.isEmpty()){
            q.poll();
        }
        return;
    }

    public int getFront() {
        // return the front element of the queue
        if(!q.isEmpty()){
            return q.peek();
        }
        return -1;
        
    }

    public int getRear() {
        // return the rear element of the queu
        if(q.isEmpty()){
            return -1;
        }
         int rear = -1;
         for(int x : q){
          rear = x;
    }

    return rear;
        }
        

    public boolean isEmpty() {
        // check whether the queue is empty
        return q.isEmpty();
    }

    public int size() {
        // return the size of the queue
        return q.size();
    }
}
