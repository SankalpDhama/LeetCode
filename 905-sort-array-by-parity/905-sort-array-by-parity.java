class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int size=nums.length; 
        int swap=0;
        int j=size-1;
        int i=0;
       while(i<=j){
           if(nums[i]%2!=0){
              //System.out.println("bheesh");
               swap=nums[i];
               nums[i]=nums[j];
               nums[j]=swap;
               j--;
           }else{
               i++;
           }          
       }
        return nums;
    }
}
        