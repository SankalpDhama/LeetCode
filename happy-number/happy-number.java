class Solution {
    int sqSum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=(digit)*(digit);
            n=n/10;            
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int hare=n;
        int tortoise=n;
        do{
            hare=sqSum(sqSum(hare));
            tortoise=sqSum(tortoise);                     
        }while(tortoise!=hare);
        if(hare==1){
            return true;
        }
    return false;
    }
}