class Solution {
    public boolean isPerfectSquare(int num) {
         if(num==0 || num==1){
            return true;
        }
        long start=0;
        long end=num;
        long mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid>num){
                end=mid-1;
                //System.out.println(end+"when mid2 is greater than target");
            }else if(mid*mid<num){
                start=mid+1;
              //  System.out.println(start+"when mid2 is smaller than target");
            }else if(mid*mid==num){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}