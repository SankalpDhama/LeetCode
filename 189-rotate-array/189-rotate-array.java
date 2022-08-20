class Solution {
    public static void reverse(int[] nums,int start,int end){
        int swap=0;
        while(start<end){
            swap=nums[start];
            nums[start]=nums[end];
            nums[end]=swap;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        k=k%size;
        reverse(nums,0,size-1-k);
        reverse(nums,size-k,size-1);
        reverse(nums,0,size-1);
    }
}