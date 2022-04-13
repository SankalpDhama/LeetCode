class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        for(int j=0;j<nums2.length;j++){
            nums1[m]=nums2[j];
            m++;
        }
        Arrays.sort(nums1);
    }
}