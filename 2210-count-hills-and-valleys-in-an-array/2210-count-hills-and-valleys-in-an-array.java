class Solution {
    public int countHillValley(int[] nums) {
        int size=nums.length;
        int answer=0;
       // boolean isHill=true;
        for(int i=1;i<size-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>=nums[i+1]){//Hill checking case
                while(nums[i]==nums[i+1] && (i+1)!=size-1){
                   // System.out.println("bheesh");
                    i++;
                }
                if(nums[i]>nums[i+1]){
                answer++;                    
                }
                //System.out.println(nums[i]);
            }
            if(nums[i]<nums[i-1] && nums[i]<=nums[i+1]){ //Valley checking case
                while(nums[i]==nums[i+1] && (i+1)!=size-1){
                  //  System.out.println("san");
                    i++;        
                }if(nums[i]<nums[i+1]){
                answer++;                    
                }
                //System.out.println(nums[i]);
            }
        }
        return answer;
    }
}