class Solution {
    public boolean judgeSquareSum(int c) {
        long rootC=(int)Math.sqrt(c);
        for(long i=0;i<=rootC;i++){
            long start=0;
            long end=rootC;
            while(start<=end){
                long mid=start+(end-start)/2;
                if(((i*i)+(mid*mid))==c){
                    return true;
                }else if(((i*i)+(mid*mid))>c){
                    end=mid-1;
                }else if(((i*i+mid*mid))<c){
                    start=mid+1;
                }
            }
        }
            return false;
    }
}