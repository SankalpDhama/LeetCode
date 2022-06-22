class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> doubleMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
            if(doubleMap.containsKey(0)){
                return true;
            }
            }
            doubleMap.put(2*arr[i],arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(doubleMap.containsKey(arr[i]) && arr[i]!=0){            
                // System.out.println(arr[i]);
                return true;                
            }           
        }
        return false;
    }
}