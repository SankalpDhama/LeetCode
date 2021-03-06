class Solution {
    double powerPositive(double num,int pow){
        if(pow==1){
            return num;
        }else{
            if(pow%2==0){
                return powerPositive(num*num,pow/2);
            }else{
                return num*powerPositive(num,pow-1);
            }
        }
    }
    double powerNegetive(double num,int pow){
        if(pow==0){
            return 1;
        }else if(pow==1){
            return num;
        }else{
            if(pow%2==0){
                return powerNegetive(num*num,pow/2);
            }else{
                return 1/num*powerNegetive(num,pow+1);
            }
        }
    }
    public double myPow(double x, int n) {
       if(n>0){
          return powerPositive(x,n); 
       }else{
           return powerNegetive(x,n);
       }
    }
}