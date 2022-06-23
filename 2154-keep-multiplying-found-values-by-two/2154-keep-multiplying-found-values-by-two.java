class Solution {
    int recurTwo(HashSet<Integer> set,int original){
        if(set.contains(original)){
            return recurTwo(set,original*2);            
        }else{
            return original;
            }
    }
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> setTwo=new HashSet<>();
        int numsSize=nums.length;
        for(int i=0;i<numsSize;i++){
         setTwo.add(nums[i]);
        }
        return recurTwo(setTwo,original);
    }
}