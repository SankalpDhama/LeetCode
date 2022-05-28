class Solution {
    public int largestAltitude(int[] gain) {
        for(int i=1;i<gain.length;i++){
            gain[i]=gain[i]+gain[i-1];
        }
        System.out.println(Arrays.toString(gain));
        int highestAltitude=0;
        for(int j=0;j<gain.length;j++){
            if(highestAltitude<gain[j]){
                highestAltitude=gain[j];
            }
        }
        return highestAltitude;
    }
}