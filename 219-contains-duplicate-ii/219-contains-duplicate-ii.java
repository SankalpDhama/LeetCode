class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int size=nums.length;
        HashMap<Integer,Integer> dupliMap=new HashMap<>();
        for(int i=0;i<size;i++){
            if(dupliMap.containsKey(nums[i])){               
                if(Math.abs(dupliMap.get(nums[i])-i)<=k){
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