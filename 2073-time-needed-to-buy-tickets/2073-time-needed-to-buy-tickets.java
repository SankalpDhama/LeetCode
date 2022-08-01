class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int size=tickets.length;
        int time=0;
        while(tickets[k]!=0){
            for(int i=0;i<size;i++){
                if(tickets[k]==0){
                    return time;
                }else if(tickets[i]==0){
                    continue;
                }else{
                    tickets[i]--;                    
                    time++;
                }
            }
        }
        return time;
    }
}