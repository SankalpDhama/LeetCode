class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if((i)==arr.length-1 || (j)==0){
                  break;
              }
            if(arr[i]<arr[i+1]){
                i++;
            }else if(arr[j]<arr[j-1]){
                j--;
            }
            else if(i==j){
                return true;
            }else{
                break;
            }
        }
        return false;
}
}