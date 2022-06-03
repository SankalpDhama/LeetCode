class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar=prices[0];
        int maxProfit=0; 
        for(int i=1;i<prices.length;i++){
            if(minSoFar>prices[i]){
                minSoFar=prices[i];
            }
            int diff=prices[i]-minSoFar;
            if(maxProfit<diff){
                maxProfit=diff;
            }
        }
        return maxProfit;
    }
}