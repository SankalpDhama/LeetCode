class Solution {
    int reverse(int num){
        int answer=0;
        while(num!=0){
            answer=answer*10+num%10;
            num=num/10;
        }
        return answer; 
    }
    public boolean isSameAfterReversals(int num) {
        int num1=reverse(num);
       // System.out.println(num1);
        int num2=reverse(num1);
        //System.out.println(num2);
        if(num2==num){
            return true;
        }else{
            return false;
        }
    }
}