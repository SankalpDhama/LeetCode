class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(seen.contains("Row"+i+board[i][j]) || seen.contains("Column"+j+board[i][j]) || seen.contains("box"+((i/3)*3)+(j/3)+board[i][j])){
                        return false;
                    }else{
                        seen.add("Row"+i+board[i][j]); seen.add("Column"+j+board[i][j]); seen.add("box"+((i/3)*3)+(j/3)+board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}