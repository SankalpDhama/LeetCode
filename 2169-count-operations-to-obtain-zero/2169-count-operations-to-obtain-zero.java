class Solution {
    int recurOperations(int num1,int num2,int count){
        if(num1==0 || num2==0){
            return count;
        }
        else if(num1>=num2){
            num1=num1-num2;
            count++;
            return recurOperations(num1,num2,count);
        }else{
            num2=num2-num1;
            count++;
            return recurOperations(num1,num2,count);
        }
    }
    public int countOperations(int num1, int num2) {
        return recurOperations(num1,num2,0);
    }
}