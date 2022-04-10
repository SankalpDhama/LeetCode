class Solution {
    public int[] sortedSquares(int[] nums) {
        int sqArrNum=0;
        int[] sqArr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sqArrNum=nums[i]*nums[i];
            sqArr[i]=sqArrNum;
        }
        Arrays.sort(sqArr);
        return sqArr;
    }
}