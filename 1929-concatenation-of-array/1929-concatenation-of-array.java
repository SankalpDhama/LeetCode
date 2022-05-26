class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*(nums.length)];
        for(int i=0;i<(2*(nums.length));i++){
            if(i<nums.length){
                //System.out.println(nums[i]);
            ans[i]=nums[i];
            }else{
                ans[i]=nums[i-nums.length];
            }
        }
        return ans;
    }
}