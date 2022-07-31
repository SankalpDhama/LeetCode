class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int size1=list1.length;
        int size2=list2.length;
        int min=Integer.MAX_VALUE;
        int sizeMax=Math.max(size1,size2);
        HashMap<String,Integer> commonMap=new HashMap<>();
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<size1;i++){
            commonMap.put(list1[i],i);
        }
        for(int i=0;i<size2;i++){
            int index=0;
           if(commonMap.containsKey(list2[i])){                
               index=commonMap.get(list2[i])+i;
               commonMap.put(list2[i],index);
               if(min>index){
                   res.clear();
                   min=commonMap.get(list2[i]);
                   res.add(list2[i]);
               }else if(min==index){
                   res.add(list2[i]);
               }
           }
        }
        int resSize=res.size();
        String[] answer=new String[resSize];
        for(int i=0;i<resSize;i++){
            answer[i]=res.get(i);
        }
        return answer;
    }
}