class RandomizedSet {
    HashMap<Integer,Integer> map;
    List<Integer> arr;
    Random rand;
    public RandomizedSet() {
        rand=new Random();
        map=new HashMap<>();
        arr=new ArrayList<>();    
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            map.put(val,arr.size());
            arr.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index=map.get(val);
            arr.set(index,arr.get(arr.size()-1));
            map.put(arr.get(arr.size()-1),index);
            arr.remove(arr.size()-1);
            map.remove(val);
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        int r=rand.nextInt(0,map.size());
        return arr.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */