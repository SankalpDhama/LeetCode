class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n<=0){
            return true;
        }
        int size=flowerbed.length;
        if(size==1 && n==1){
            if(flowerbed[0]==0){
                return true;
            }else{
                return false;                
            }
        }
        for(int i=0;i<size-1;i++){
            if(flowerbed[i]==0 && flowerbed[i+1]==0) {
                flowerbed[i]=1;
                n--;
                i++;
            }else if(flowerbed[i]==1){
                i++;
            }
        }
        if(flowerbed[size-1]==0 && flowerbed[size-2]==0){
            n--;
        }
        if(n<=0){
            return true;
        }else{
            return false;
        }
    }
}