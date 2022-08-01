class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        while(true){
            if((n-i)>=0){
                n-=i;
                i++;
            }else{
                return (i-1);
            }
        }
    }
}