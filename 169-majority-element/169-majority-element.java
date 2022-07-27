class Solution {
    public int majorityElement(int[] nums) {
        int size=nums.length;
        int count=0;
        int maj=0;
        for(int i=0;i<size;i++){
            if(count==0){
              maj=nums[i];  
            }
            if(maj==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return maj;
    }
}