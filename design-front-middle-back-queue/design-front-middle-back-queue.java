class FrontMiddleBackQueue {
​
    public LinkedList<Integer> list;
    public FrontMiddleBackQueue() {
        list = new LinkedList<>();
    }
    
    public void pushFront(int val) {
        list.offerFirst(val);
    }
    
    public void pushMiddle(int val) {
        int mid = list.size()/2;
        list.add(mid, val);
    }
    
    public void pushBack(int val) {
        list.offer(val);
    }
    
    public int popFront() {
        if(list.isEmpty()) return -1;
        return list.pollFirst();
    }
    
    public int popMiddle() {
        if(list.isEmpty()) return -1;
        
        int mid = list.size()/2;
        if(list.size() % 2 == 0){
            mid--;
        }
        int temp = list.get(mid);
        list.remove(new Integer(temp));
        System.out.println(list.toString());
        return temp;
    }
    
    public int popBack() {
        if(list.isEmpty()) return -1;
        return list.pollLast();
    }
}
​
/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
