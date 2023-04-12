class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void swap(List<Integer> arr,int i,int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    void backtrack(List<Integer> arr,int index){
        index++;
        int size=arr.size();
            if(index==size){
                ans.add(arr);
                return;
            }
        for(int i=index;i<size;i++){
            swap(arr,index,i);
            ArrayList<Integer> curArr=new ArrayList<>(arr);
            backtrack(curArr,index);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int size=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<size;i++){
            arr.add(nums[i]);
        }
        if(size==1){
            ans.add(arr);
            return ans;
        }
        swap(arr,0,1);
        backtrack(arr,-1);
        return ans;
    }
}