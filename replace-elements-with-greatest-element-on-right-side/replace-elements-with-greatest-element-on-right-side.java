class Solution {
    public int[] replaceElements(int[] arr) {
        int size=arr.length;
        int temp;
        int greatestEle=-1;
        for(int i=size-1;i>=0;i--){
             if(greatestEle<arr[i]){ 
                 temp=arr[i];
                 arr[i]=greatestEle;                 
                greatestEle=temp;                
             }else{
                 arr[i]=greatestEle;
             }                              
        }
        return arr;
    }
}