class Solution {
    public int maxDistance(int[] colors) {
        int size=colors.length;
        int ans1=0;
        int i=0;
        int j=size-1;
        while(i<j){
            if(colors[i]!=colors[j]){
                int curAns=Math.abs(i-j);
                if(curAns>ans1){
                    ans1=curAns;
                }
            }
                j--;
        }
        i=0;
        j=size-1;
        int ans2=0;
        while(i<j){
            if(colors[i]!=colors[j]){
                int curAns=Math.abs(i-j);
                if(curAns>ans2){
                    ans2=curAns;
                }
            }
            i++;
        }
        return Math.max(ans1,ans2);
    }
}