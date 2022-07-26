class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int size=nums.length;
        HashMap<Integer,Integer> dupliMap=new HashMap<>();
        for(int i=0;i<size;i++){
            int index=i;
            if(dupliMap.containsKey(nums[i])){   
                index=dupliMap.get(nums[i]);
                if(Math.abs(index-i)<=k){
                    return true;
                }else{                           
                    dupliMap.put(nums[i],i);
                }
            }else{
                dupliMap.put(nums[i],i);
            }
        }
            return false;
    }
}