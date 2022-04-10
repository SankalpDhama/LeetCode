class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
                //System.out.println(temp+ " this is tempin loop");
            }if(count<temp){
                count=temp;
            }
            else if(nums[i]==0){
                temp=0;
            }
           // System.out.println(count+" this is count");
            //System.out.println(temp+" this is temp");
        }
        return count;
    }
}