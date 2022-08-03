class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int answer=0;
        for(int i=0;i<nums1.length;i++){
            int start=i;
            int end=nums2.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums1[i]<=nums2[mid]){
                   //System.out.println(i+"bitch");
                    answer=Math.max(answer,(mid-i));
                    start=mid+1;
                }
                else if(nums1[i]>nums2[mid]){
                    //System.out.println(i+"bheesh");
                    end=mid-1;
                }
            }            
        }
        return answer;
    }
}