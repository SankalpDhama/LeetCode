class Solution{
    public int minimumCost(int[] cost){
        int size=cost.length;
        int answer=0;
        int index=0;
        Arrays.sort(cost);
        for(int i=size-1;i>=0;i--){
            if(index==2){
                index=0;
            }else{
                index++;
                answer=answer+cost[i];
            }
        }
        return answer;
    }
}