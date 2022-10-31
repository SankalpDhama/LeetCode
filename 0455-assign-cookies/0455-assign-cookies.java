class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int greedSize=g.length;
        int cookieSize=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int answer=0;
        int j=0;
        int i=0;
        while(i<greedSize && j<cookieSize){
            if(g[i]>s[j]){
                j++;            
            }else{
                answer++;
                i++;
                j++;
            }                        
        }
        return answer;
    }
    
}