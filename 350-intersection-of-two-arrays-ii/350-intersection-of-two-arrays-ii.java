class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr=new int[1001];
        List<Integer> answerList=new ArrayList<>();        
        for(int i=0;i<nums1.length;i++){
            arr[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(arr[nums2[i]]!=0){
               answerList.add(nums2[i]);
               arr[nums2[i]]--; 
            }
        }
        int size=answerList.size();
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
            ans[i]=answerList.get(i);
        }
        return ans;
    }
}