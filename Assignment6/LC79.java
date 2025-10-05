package Assignment6;

public class LC79 {
    class Solution {
    public boolean exist(char[][] board, String word) {
        // Backtracking to find the word in the board
        boolean[][] visited = new boolean[board.length][board[0].length];

        char ele = word.charAt(0);
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == ele){
                    boolean res = call(board,word,i,j,visited,0);
                    if(res == true){
                        return res;
                    }
                }
            }
        }
      

        return false;
    }

    public static boolean call(char[][] board,String word,int cr,int cc,boolean[][] visited,int index){

        if(index == word.length()){
            return true;
        }

        if(cr < 0 || cr >= board.length || cc < 0 || cc >= board[0].length || visited[cr][cc] == true || board[cr][cc] != word.charAt(index)){
            return false;
        }

        visited[cr][cc] = true;

        
        boolean found = (call(board,word,cr,cc+1,visited,index + 1) ||
        call(board,word,cr-1,cc,visited,index + 1) ||
        call(board,word,cr,cc-1,visited,index + 1) ||
        call(board,word,cr+1,cc,visited,index + 1));
        visited[cr][cc] = false;

        return found;

    }
}
}
