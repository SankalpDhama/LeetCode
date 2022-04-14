class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;            
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                start=mid+1;
            }else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                end=end-1;
            }else{
                return -1;
            }
        }
        return -1;
    }
}