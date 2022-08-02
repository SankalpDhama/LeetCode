class Solution {
    public int specialArray(int[] nums) {
        int size=nums.length;
        int count=0;
        int start=1;
        int end=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            count=0;
            for(int i=0;i<size;i++){
                if(mid<=nums[i]){
                    count++;
                }else{
                    continue;
                }
            }
            if(mid==count){
                return mid;
            }else if(mid<count){
                start=mid+1;
            }else if(mid>count){
                end=mid-1;
            }
        }
        return -1;
    }
}