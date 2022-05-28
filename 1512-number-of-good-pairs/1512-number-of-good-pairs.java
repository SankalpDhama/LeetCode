class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> pairs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int count=0;
            if(pairs.get(nums[i])!=null){
                count=pairs.get(nums[i]);
                count++;
                sum+=count;
            }
            pairs.put(nums[i],count);
           // System.out.println(pairs+"for the "+i+" number");
        }
       // System.out.println(pairs);
        return sum;
    }
}