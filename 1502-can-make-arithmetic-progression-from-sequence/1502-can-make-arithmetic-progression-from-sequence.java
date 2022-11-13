class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        final int size=arr.length;
        if(size==2){
            return true;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<size-1;i++){
            if(arr[i]-arr[i-1]!=arr[i+1]-arr[i]){
                return false;
            }
        }
        return true;
    }
}