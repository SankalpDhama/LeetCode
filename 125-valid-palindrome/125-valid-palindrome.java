class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        System.out.println(s);
        if(s=="" || s.length()==1){
            return true;
        }
        int i=0,j=s.length()-1;
        boolean flag=false;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                //System.out.println("kutiya");
                flag=true;
                i++;
                j--;
            }else{
                //System.out.println("cat");  
                flag=false;
                 break;    
            }
        }
        return flag;
    }
}