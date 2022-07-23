class Solution {
    public boolean detectCapitalUse(String word) {
        int size=word.length();
        if(size==1){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            if(Character.isUpperCase(word.charAt(1))){
                for(int i=0;i<size;i++){
                    if(Character.isUpperCase(word.charAt((i)))){
                        continue;
                    }else{
                        return false;
                    }
                }
            }else{
                for(int i=1;i<size;i++){
                    if(Character.isLowerCase(word.charAt(i))){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }else{
            for(int i=0;i<size;i++){
                if(Character.isLowerCase(word.charAt(i))){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;        
    }
}