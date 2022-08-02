class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int size1=arr1.length;
        Arrays.sort(arr2);
        int start=0;
        int end=arr2.length-1;
        int distance=0;    
        for(int i=0;i<size1;i++){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(Math.abs(arr1[i]-arr2[mid])>d){
                    if(arr2[mid]>arr1[i]){                        
                    end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }else if(Math.abs(arr1[i]-arr2[mid])<=d){                   
                    distance++;                   
                    break;
                }
            }
            start=0;
            end=arr2.length-1;
        }
        return size1-distance;
    }
}