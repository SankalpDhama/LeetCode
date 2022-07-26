class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int size1=nums1.length;
        int size2=nums2.length;
        HashMap<Integer,Integer> intersect=new HashMap<>();
        ArrayList<Integer> answerList=new ArrayList<>(); 
        int count=1;
        for(int i=0;i<size1;i++){
            if(intersect.containsKey(nums1[i])){
               count=intersect.get(nums1[i]);
               intersect.put(nums1[i],++count);
               count=1; 
            }else{
                intersect.put(nums1[i],count);
            }
        }
        for(int i=0;i<size2;i++){
            if(intersect.containsKey(nums2[i])){
                count=intersect.get(nums2[i]);
                if(count>0){
                   answerList.add(nums2[i]); 
                }
                intersect.put(nums2[i],--count);
            }
        }
        int sizeList=answerList.size();
        int[] answer=new int[sizeList];
        for(int i=0;i<sizeList;i++){
            answer[i]=answerList.get(i);
        }
        return answer;
    }
}