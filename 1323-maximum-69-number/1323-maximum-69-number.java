class Solution {
    public int maximum69Number(int num) {
        String s=String.valueOf(num);
        int size=s.length();
        boolean flag=false;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size;i++){
           if((int)s.charAt(i)==54 && !flag){
               flag=true;
               sb.append((char)57);
           }else{
               sb.append(s.charAt(i));
           }
        }
        s=sb.toString();
        return Integer.valueOf(s);
    }
}