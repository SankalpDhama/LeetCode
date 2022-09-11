class Solution {
    public int missingNumber(int[] nums) {
        int size=nums.length;        
        int[] arr=new int[size+1];
        for(int i=0;i<size;i++){        
            arr[nums[i]]++;
        }       
        for(int i=0;i<=size;i++){           
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
    }
}