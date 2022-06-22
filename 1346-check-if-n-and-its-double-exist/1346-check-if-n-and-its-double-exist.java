class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Double> doubleCheckSet=new HashSet<>();
        for(double i:arr){
                if(doubleCheckSet.contains(i*2) || doubleCheckSet.contains(i/2)){
                    return true;
                }
            doubleCheckSet.add(i);            
        }
        return false;
    }
}