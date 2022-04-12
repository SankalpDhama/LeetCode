class Solution {
    public void reverseString(char[] s) {
        int i=0;
        char temp='a';
        int j=s.length-1;
        while(i<j){
            //System.out.println(i);
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        System.out.println(s);
    }
}