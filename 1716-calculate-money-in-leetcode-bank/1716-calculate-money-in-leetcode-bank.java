class Solution {
    public int totalMoney(int n) {
        int totalAmount=0;
        int mondayAmount=1;
        int dayAmount=0;
        for(int i=1;i<=n;i++){
            dayAmount++;
            totalAmount+=dayAmount; 
            if(i%7==0){
                dayAmount=mondayAmount;  
                mondayAmount++;
            }                
        }
        return totalAmount;
    }
}