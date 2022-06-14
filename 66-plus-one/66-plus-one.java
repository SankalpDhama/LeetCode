class Solution {
    public int[] plusOne(int[] digits) {
        boolean isNine=false;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9){
                isNine=true;
            }else{
                isNine=false;
                break;
            }
        }
        int[] plusOne=new int[digits.length+1];
        int i=digits.length-1;
        try{
            while(digits[i]==9){
            digits[i]=0;
            plusOne[i+1]=0;
            i--;
      }
        digits[i]=digits[i]+1;
           }catch(Exception e){
            
        };
           plusOne[0]=1;       
        if(isNine){
            return plusOne;
        }else{
            return digits;
        }
 }
}