class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        int rotatingFactor=size;
        if(size<=1 || size==k){
            return;
        }
        int[] rotatedArray=new int[size];
        if(size<k){
            int factor=k/size;
            factor=factor*size;
            factor=k-factor;
            for(int i=0;i<size;i++){
               if(i+factor<=size-1){
                rotatedArray[i+factor]=nums[i];
            }else if(i+factor>size-1){
               // System.out.println(i);
                rotatedArray[Math.abs(size-(i+factor))]=nums[i];
            }
        } 
            }
        else{
        for(int i=0;i<size;i++){
            if(i+k<=size-1){
                rotatedArray[i+k]=nums[i];
            }else if(i+k>size-1){
               // System.out.println(i);
                rotatedArray[Math.abs(size-(i+k))]=nums[i];
            }
        }
        }
        //System.out.println(Arrays.toString(rotatedArray));
        for(int i=0;i<size;i++){
            nums[i]=rotatedArray[i];
        }
        
    }
}