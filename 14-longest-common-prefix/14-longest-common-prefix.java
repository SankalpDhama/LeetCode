class Solution {
    public String longestCommonPrefix(String[] strs) {
        String a="";
        String b="";
        if(strs.length==1){
            a=strs[0];
            return a;
        }
        for(int i=0;i<strs.length-1;i++){
            if(i==0){
                for(int j=0;j<=strs[i].length()-1 && j<=strs[i+1].length()-1;j++){
                     //System.out.println("hey");
                    if(strs[i].charAt(j)==strs[i+1].charAt(j)){
                        a=a+strs[i].charAt(j);
                        //System.out.println(a);
                    }else{break;}
                }
            }
            else if(i>=1){
                b=a;
                a="";
                //System.out.println(b);
                for(int j=0;j<strs[i+1].length() && j<b.length();j++){
                    //System.out.println("hello");
                    if(b.charAt(j)==strs[i+1].charAt(j)){
                        a=a+b.charAt(j);
                        //System.out.println(a);
                    }else{break;}
                }
            }    
        }
        return a;
        
    }
}