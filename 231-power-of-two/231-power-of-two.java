class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n!=0){
            if(n%2!=0 && n!=1){                
               // System.out.println(n%2);
               // System.out.println(n);
                return false;
            }
            n=n/2;
        }
        return true;
    }
}