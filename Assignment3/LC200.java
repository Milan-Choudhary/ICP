package Assignment3;

public class LC200 {
    class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    count += 1;
                }
            }  
        }

        return count;
    }

    public static void dfs(int i,int j,char[][] grid,boolean[][] visited){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length 
        || visited[i][j] == true || grid[i][j] == '0'){
            return;
        }

        visited[i][j] = true;

        int[] Rm = {0,1,0,-1};
        int[] Cm = {1,0,-1,0};

        for(int k = 0; k<4; k++){
            int r = Rm[k] + i;
            int c = Cm[k] + j;

            dfs(r,c,grid,visited); 
        }

    }
}
}
