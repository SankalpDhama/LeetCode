class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> singleSet=new HashSet<>();
        for(int num:nums){
            if(singleSet.contains(num)){
                singleSet.remove(num);
            }else{
                singleSet.add(num);
            }
        }
        for(int num:singleSet){
            return num;
        }
        return -1;
    }
}