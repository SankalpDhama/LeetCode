class Solution {
    public int maxDistance(int[] colors) {
        int size=colors.length;
        int ans=0;
        for(int i=0;i<size;i++){
            int j=size-1;
            while(i<=j){
                if(colors[i]!=colors[j]){
                    int curDist=Math.abs(i-j);
                            // System.out.println("not color");
                            // System.out.print(colors[i]+" ");                           
                            // System.out.print(colors[j]); 
                            // System.out.println("");
                       if(curDist>ans){
                           ans=curDist;
                          // System.out.println("max"+ans);
                    }
                }
                j--;
            }
        }
        return ans;
    }
}