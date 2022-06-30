class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int size=nums.length;
        int[] answer=new int[size];
        int answerInd=0;
        for(int i=0;i<size;i++){
            if(nums[i]%2==0){
                answer[answerInd++]=nums[i];                
            }
        }for(int i=size-1;i>=0;i--){
            if(nums[i]%2!=0){
                answer[answerInd++]=nums[i];
            }
        }
        return answer;
    }
}
        