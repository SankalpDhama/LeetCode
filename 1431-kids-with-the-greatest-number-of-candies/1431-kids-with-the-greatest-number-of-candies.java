class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> tfArray=new ArrayList<>(candies.length);
        int maxCandies=Integer.MIN_VALUE;
        for(int j=0;j<candies.length;j++){
            if(candies[j]>maxCandies){
                maxCandies=candies[j];
            }
        }
        //System.out.println(maxCandies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxCandies){
               tfArray.add(true);
            }else{
                tfArray.add(false);
            }
        }
        return tfArray;
    }
}