class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int answer=0;
        for(int i=0,j=0;i<nums1.length && j<nums2.length;){
            if(nums1[i]>nums2[j]){
                i++;
            }else if(nums1[i]<=nums2[j]){
                answer=Math.max(answer,j++-i);
            }
        }
         return answer;            
    }
}