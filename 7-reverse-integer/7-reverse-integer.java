class Solution {
    double reverseNum(int num){
        int remainder=0;
        double answer=0;
        while(num!=0){
            remainder=num%10;
            answer=answer*10+remainder;
            num=num/10;
        }
        return answer;
    }
    public int reverse(int x) {
        double answer=reverseNum(x);
        if(answer>(Math.pow(2,31)-1) || answer<Math.pow(-2,31)){
            return 0;
        }else{
        return (int)answer;            
        }
    }
}