class Solution {
    public String addBinary(String a, String b) {
        int size1=a.length();
        int size2=b.length();
        StringBuilder sb=new StringBuilder();        
        int i=size1-1;
        int j=size2-1;
        int carry=0;
        while(i>=0 || j>=0){
            int num1= i>=0?a.charAt(i)-'0':0;
            int num2= j>=0?b.charAt(j)-'0':0;
            int temp=num1+num2+carry;
           // System.out.println(temp+"for iteration"+i+" "+j);
            //System.out.println(num1+" "+num2+" ");
            carry=temp/2;
            sb.append(temp%2);
            i--;j--;
        }
       // System.out.println(sb.toString()+"before carry");
        if(carry!=0){
        //System.out.println(carry+"final carry");            
            sb.append(carry);
        }
       // System.out.println(sb.toString()+"before reverse");
        sb=sb.reverse();
        return sb.toString();
    }
}