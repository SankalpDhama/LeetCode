class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(int)Math.sqrt(c);       
        while(i<=j){
            if(((i*i)+(j*j))<c){
                i++;
            }else if(((i*i)+(j*j))>c){
                j--;
            }else if(((i*i)+(j*j))==c){
                return true;
            }
        }
        return false;
    }
}