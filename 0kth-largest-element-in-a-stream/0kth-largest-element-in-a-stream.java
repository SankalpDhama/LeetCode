class KthLargest {
    PriorityQueue<Integer> p=new PriorityQueue<>();
    int size;
    int k;
    public KthLargest(int k, int[] nums) {
        size=0;
        this.k=k;
        for(int val: nums){
            if(size>=k){                
              if(p.peek()<val){
                  p.poll();
                  p.add(val);
              }
            }else{
                p.add(val);
            }
            size++;
        }
        // System.out.println(p+" queue");
    }
    
    public int add(int val) {
        if(size<k){
            p.add(val);
            size++;
            return p.peek();
        }
        if(p.peek()<val){
            p.poll();
            p.add(val);
        }
        size++;
        return p.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */