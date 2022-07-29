class Solution {
    public int findKthPositive(int[] arr, int k) {
        int size=arr.length-1;
        if(k<arr[0]){
            return k;
        }
        int start=0;
        int end=size;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]-(mid+1)<k){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        start--;
        int missingCount=arr[start]-(start+1);
        return arr[start]+(k-missingCount);
    }
}