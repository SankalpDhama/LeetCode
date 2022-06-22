class Solution {
    public void reverseString(char[] s) {
        int i=0;
        char temp='a';
        while(i!=(s.length)/2){
            //System.out.println(i);
            temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
            i++;
        }
        System.out.println(s);
    }
}