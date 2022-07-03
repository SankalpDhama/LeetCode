class Solution {
    public int findClosestNumber(int[] nums) {
        int size=nums.length;
        int positiveMin=Integer.MAX_VALUE-1;
        int negetiveMax=Integer.MIN_VALUE+1;
        for(int num:nums){
            if(num>0){
               positiveMin=Math.min(positiveMin,num); 
            }else{
                negetiveMax=Math.max(negetiveMax,num);
            }
        }               
        if(positiveMin>Math.abs(negetiveMax)){
            return negetiveMax;
        }else{
            return positiveMin;
        }
    }
}