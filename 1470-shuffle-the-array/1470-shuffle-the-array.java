class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray=new int[2*n];
        int shuffledArrayIndex=0;
       for(int i=0;i<n;i++){
         //  System.out.println(i+" this is index");
           //System.out.println(nums[i]+" this is array with index");
           shuffledArray[shuffledArrayIndex]=nums[i];
           //System.out.println(shuffledArray[shuffledArrayIndex]+" this is shufflearray");
           shuffledArrayIndex++;
           shuffledArray[shuffledArrayIndex]=nums[n+i];
           shuffledArrayIndex++;
           //System.out.println(i+" this is index after increment");
       }
        return shuffledArray;
    }
}