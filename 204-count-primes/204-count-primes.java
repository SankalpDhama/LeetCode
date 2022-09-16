class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime=new boolean[n+1];
        //Arrays.fill(isPrime,true);
         // isPrime[0]=false;
         // isPrime[1]=false;
        int answer=0;
       // int rootN=(int)Math.sqrt(n);
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                isPrime[j]=true;
            }
        }
        for(int i=2;i<n;i++){
            if(isPrime[i]==false){
                answer++;
            }
        }
        return answer;
    }
}