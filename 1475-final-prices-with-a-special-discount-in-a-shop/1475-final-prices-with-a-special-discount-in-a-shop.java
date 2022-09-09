class Solution {
    public int[] finalPrices(int[] prices) {
        int size=prices.length;
        int[] answer=new int[size];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(prices[i]>=prices[j]){
                    answer[i]=prices[i]-prices[j];
                  //  System.out.println(prices[i]+" and discount"+prices[j]);
                    break;
                }else{
                    answer[i]=prices[i];
                }
            }
        }
        answer[size-1]=prices[size-1];
        return answer;
    }
}