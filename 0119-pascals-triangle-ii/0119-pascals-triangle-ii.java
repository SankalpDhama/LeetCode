class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answerList=new ArrayList<>();
        List<Integer> auxList=new ArrayList<>();
        //answerList.add(1);
        for(int rows=0;rows<=rowIndex;rows++){
            answerList.clear();
            for(int columns=0;columns<=rows;columns++){
                if(columns==0 || columns==rows){
                   answerList.add(columns,1);
                }else{
                    //System.out.println(columns);
                    answerList.add(columns,auxList.get(columns-1)+auxList.get(columns));
                }
            }
            auxList.clear();
            for(int i=0;i<answerList.size();i++){
                auxList.add(answerList.get(i));
            }
        }
        return answerList;
    }
}