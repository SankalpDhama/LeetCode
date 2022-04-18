class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        if((int)target<(int)letters[start]){
            return letters[start];
        }
        int end=letters.length-1;
        if((int)target<(int)letters[end] && (int)target> (int)letters[end-1]){
            return letters[end];
        }
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            // System.out.println(letters[mid]+" this is mid");
            // System.out.println(letters[start]+" this is start");
            // System.out.println(letters[end]+" tjhis is end");
           if((int)target<(int)letters[mid])
            {
               end=mid-1;
            }
            else{
               start=mid+1;
           } 
        }
        //System.out.println(letters[mid]+" this is mid");
        if((int)letters[mid]>(int)target && mid==letters.length-1){
            return letters[mid];
        }
        else if(mid==letters.length-1){
            return letters[0];
        }
        else{return letters[start];}
    }
}