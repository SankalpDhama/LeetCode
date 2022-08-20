class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        int size=words.length;
        StringBuilder sb=new StringBuilder();
        //System.out.println(Arrays.toString(words));
        for(int i=size-1;i>=0;i--){
            for(int j=0;j<words[i].length();j++){
                //     // System.out.println(i);
                //     // System.out.println(words[i]);
                // if(words[i].equals(words[1])){
                //     continue;
                // }
                if(words[i].charAt(j)==' '){
                    j++;
                }else{
                    sb.append(words[i].charAt(j));
                }
            }
            if(i!=0){
                sb.append(" ");
            }
        }//while(sb.charAt())
        //sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}