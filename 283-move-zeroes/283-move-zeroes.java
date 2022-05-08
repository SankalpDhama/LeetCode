class Solution {
    public void moveZeroes(int[] nums) {
        int countZero=0;
        int tempSwap=0;
        for(int i=nums.length-1-countZero;i>=0;i--){
            //System.out.println(i+"in the loop");
            if(nums[i]==0){
           //     System.out.println(i+"in the conditionals");
                countZero++;
                for(int j=i;j<nums.length-countZero;j++){
//                    System.out.println("swapping is running for index: "+i);
                    tempSwap=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=tempSwap;
                }            
            }
        }
    }
}