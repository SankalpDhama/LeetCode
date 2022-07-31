class MyHashSet {

    int[] set=new int[(int)(1E6+1)];
    
    public MyHashSet() {
    }
    
    public void add(int key) {
        set[key]=1;
    }
    
    public void remove(int key) {
        set[key]=0;
    }
    
    public boolean contains(int key) {
        if(set[key]==1){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */