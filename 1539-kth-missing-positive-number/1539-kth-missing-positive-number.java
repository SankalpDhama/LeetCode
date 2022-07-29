class Solution {
    public int findKthPositive(int[] arr, int k) {
        int size=arr.length;
        int num=k;
        if(k<arr[0]){
            return num;
        }
        for(int a:arr){
            if(a<=num){
                num++;
            }else{
                break;
            }
        }
        return num;
    }
}