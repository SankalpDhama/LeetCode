class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answerList=new ArrayList<>();
        for(int rows=0;rows<numRows;rows++){
            List<Integer> triangle=new ArrayList<>();            
            for(int columns=0;columns<=rows;columns++){
                if(columns==0 || columns==rows){
                    triangle.add(columns,1);
                }else{
                    triangle.add(columns,answerList.get(rows-1).get(columns-1)+answerList.get(rows-1).get(columns));
                }                
            }
            answerList.add(triangle);
        }
        return answerList;
    }
}