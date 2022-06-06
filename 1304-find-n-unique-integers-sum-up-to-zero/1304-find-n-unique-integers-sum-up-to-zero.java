class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        if(n==1){
            arr[0]=0;
            return arr;
        }
        int i=0;
        int j=n-1;
       while(i<j){
            arr[i]=(n/2+i);          
            arr[j]=-(n/2+i);
           i++;
           j--;
       }
        if(n%2!=0){
            arr[n/2]=0;
        }
     return arr;   
    }
}