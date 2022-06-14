class Solution {
    public int[] plusOne(int[] digits) {
        int digitsSize=digits.length;
        int i=0;
        for(i=digitsSize-1;i>=0;i--){
            digits[i]=digits[i]+1;
            if(digits[i]==10){
                digits[i]=0;
            }else{
                break;
            }
        }if(i==-1){
            int[] digitsPlusOne=new int[digitsSize+1];
            digitsPlusOne[0]=1;
            return digitsPlusOne;
        }
        return digits;
    }
}