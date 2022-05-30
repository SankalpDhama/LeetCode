class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray=new int[2*n];
        int shuffledArrayIndex=0;
       for(int i=0;i<n;i++){
           shuffledArray[shuffledArrayIndex++]=nums[i];
           shuffledArray[shuffledArrayIndex++]=nums[n+i];
       }
        return shuffledArray;
    }
}