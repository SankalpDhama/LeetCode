class MyHashMap {
    
    int[] map=new int[(int)(1E6+1)];
        
    public MyHashMap() {
       Arrays.fill(map,-1); 
    }
    
    public void put(int key, int value) {
        map[key]=value;
    }
    
    public int get(int key) {
        if(map[key]!=-1){
            return map[key];
        }else{
            return -1;
        }
    }
    
    public void remove(int key) {
        if(map[key]!=-1){
            map[key]=-1;
        }else{
            return;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */