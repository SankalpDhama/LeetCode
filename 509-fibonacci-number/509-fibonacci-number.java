class Solution {
    int fibo(int n){
        if(n==1 ){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public int fib(int n) {
      return fibo(n);  
    }
}