class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                //System.out.println(temp+ " this is tempin loop");
            }
            else{
                max=Math.max(max,count);
                count=0;
                
            }
           // System.out.println(count+" this is count");
            //System.out.println(temp+" this is temp");
        }
        max=Math.max(max,count);
        return max;
    }
}