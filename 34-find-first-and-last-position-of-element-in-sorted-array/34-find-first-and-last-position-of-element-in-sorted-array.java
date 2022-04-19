class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]!=target){
                System.out.println(i);
                i++;
            }else if(nums[j]!=target){
                System.out.println(j);
                j--;
            }else{
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}