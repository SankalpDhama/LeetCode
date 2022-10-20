class Solution {
    int fiboStairs(int n,int[] auxArray){
        if(n==1 || n==2){
            return n;
        }else{
            if(auxArray[n-1]!=0 && auxArray[n-2]!=0){
            }else if(auxArray[n-1]!=0){
                auxArray[n-2]=fiboStairs(n-2,auxArray);
            }else if(auxArray[n-2]!=0){
                auxArray[n-1]=fiboStairs(n-1,auxArray);
            }else{
                auxArray[n-1]=fiboStairs(n-1,auxArray);
                auxArray[n-2]=fiboStairs(n-2,auxArray);
            }
            return auxArray[n-1]+auxArray[n-2];
        }
    }
    public int climbStairs(int n) {
        int[] auxArray=new int[n];
        return fiboStairs(n,auxArray);
    }
}