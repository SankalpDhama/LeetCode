class Solution {
        int[] largestNum(int[] arr){
            int largest=Integer.MIN_VALUE;
            int index=-1;
            for(int i=0;i<=arr.length-1;i++){
                if(largest<arr[i]){
                    largest=arr[i];
                    index=i;
                }else{
                    continue;
                }
            }
            return new int[] {largest,index};
        }
    public int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int largest=largestNum(nums)[0];
        int index=largestNum(nums)[1];
        // System.out.println(largest);
        // System.out.println(index+"this is index");
        for(int i=0;i<=nums.length-1;i++){
            if(i==index){
                i++;
            }
            if(i==nums.length){
                break;
            }
            // System.out.println(i);
            if(nums[i]*2>largest){
                return -1;
            }else{
                continue;
            }
        }
        return index;
    }
}