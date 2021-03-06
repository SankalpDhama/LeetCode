/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int BinaryMid=0;
        while(start<=end){
            BinaryMid=start+(end-start)/2;
            if(isBadVersion(BinaryMid)){
               // System.out.println("bad boy");
                end=BinaryMid-1;
            }else if(!isBadVersion(BinaryMid)){
               // System.out.println("good boy");
                start=BinaryMid+1;
            }
        }        
        return start;
    }   
}