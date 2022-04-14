import java.lang.Math;
class Solution {
    //finding the squareRoot by Binary Search
    static int binarySearchSqrt(int target){
        if(target==0 || target==1){
            return target;
        }
        long start=0;
        long end=target;
        long mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            //System.out.println(mid);
            if((mid-1)*(mid-1)<target && (mid*mid)>target){
                //System.out.println("hello bitch");
                
                return (int)mid-1;
            }
            else if(mid*mid<target){
                //System.out.println(mid*mid+"target is greater");
                //System.out.println(start+"this is start");
               start=mid+1;
            }else if(mid*mid>target){
               // System.out.println(mid*mid+"target is less");
                //System.out.println(end+"end");
                
                end=mid-1;                 
            }
            else{
                return (int)mid;
            }
        }
        return -1;
    }
    public int mySqrt(int x) {
       return binarySearchSqrt(x);
    }
}