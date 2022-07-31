class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1=nums1.length;
        int size2=nums2.length;
        int[] mergedArray=new int[size1+size2];
        int i=0,j=0,k=0;        
        while(i<size1 && j<size2){
          if(nums1[i]<nums2[j]){
              //System.out.println("bitch");
              mergedArray[k]=nums1[i];
              i++;
          }else{
              //System.out.println("bheesh");
              mergedArray[k]=nums2[j];
              j++;              
          }
            k++;
        }
        while(i<size1){
           mergedArray[k]=nums1[i];
           i++;
           k++; 
        }
        while(j<size2){
            mergedArray[k]=nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(mergedArray));
        int mergedArraySize=size1+size2;
        int medianIndex=0;
        double median=0;
        if(mergedArraySize%2==0){
            medianIndex=mergedArraySize/2;
            System.out.println(mergedArray[medianIndex]+mergedArray[medianIndex-1]);
            median=(mergedArray[medianIndex]+mergedArray[medianIndex-1])/2.0d;
        }else{
            medianIndex=mergedArraySize/2;
            median=mergedArray[medianIndex];
        }
        return median;
    }
}