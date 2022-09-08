class Solution {
    public int findPeakElement(int[] nums) {
        int end=nums.length-1;
        if(end==0){
            return 0;
        }
        int lastIndex=end;
        int start=0;
        while(start<=end){        
             int mid=start+(end-start)/2;
            if(mid>0 && mid<lastIndex){
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                   // System.out.println("1");
                    return mid;
                }else if(nums[mid]>nums[mid-1]){
                   // System.out.println("2");
                    start=mid+1;
                }else{
                   // System.out.println("3");
                    end=mid-1;
                }
            }else{
                if(mid==0){
                    if(nums[mid]>nums[mid+1]){
                       // System.out.println("bheesh"+nums[mid]+" "+nums[mid+1]);
                        return 0;
                    }else{
                    return 1;
                    }
                }else if(mid==lastIndex){
                    if(nums[mid]>nums[mid-1]){
                        return lastIndex;
                    }else{
                    return lastIndex-1;
                    }
                }
            }
        }
        return 0;
    }
}