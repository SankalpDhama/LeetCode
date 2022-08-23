class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size=rooms.size();
      //  System.out.println(size);
        HashSet<Integer> keys=new HashSet<>();
        keys.add(0);
        Stack<Integer> roomKeys=new Stack<>();
        int roomVisited=0;
        roomKeys.push(0);
        while(!roomKeys.isEmpty()){
            int j=roomKeys.pop();
           // System.out.println(roomVisited);
            int sizeRoom=rooms.get(j).size();
            for(int i=0;i<sizeRoom;i++){
                //System.out.println("bheesh");
                int key=rooms.get(j).get(i);
                if(keys.contains(key)){
                    continue;
                }else{
                    roomKeys.push(key);
                    keys.add(key);
                }
            }
            roomVisited++;
        }
        //return false;
        if(roomVisited==size){
        return true;            
        }else{
            return false;
        }
    }
}