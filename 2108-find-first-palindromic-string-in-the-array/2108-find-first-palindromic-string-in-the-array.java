class Solution {
    public String firstPalindrome(String[] words) {
        boolean temp=true;
      for(int i=0;i<words.length;i++){
          if(words[i].length()==1){
              return words[i];
          }
           for(int j=0;j<(words[i].length())/2;j++){
               if(words[i].charAt(j)!=words[i].charAt(words[i].length()-j-1)){   
                  System.out.println(words[i]+":"+j+"charCheck");
                   System.out.println(words[i]+":"+(words[i].length()-j-1)+"charAtlastCheck");
                   temp=false;
                   break;
               }else{
                  System.out.println(words[i].charAt(words[i].length()-j-1)+"check");
                   temp=true;
                   continue;
               }
           }if(temp){
               return words[i];
           }
      } 
        return "";
    }
}