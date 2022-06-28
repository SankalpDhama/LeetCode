class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        int size1=nums1.length;
        int size2=nums2.length;
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
               set2.add(num); 
            }
        }
        int[] answerArray=new int[set2.size()];
        int counter=0;
        for(int num:set2){
            answerArray[counter++]=num;                
        }
        return answerArray;
    }
}