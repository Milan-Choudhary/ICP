package Assignment7;

public class LC62 {
    class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n];
        int count = paths(m,n,0,0,dp);

        return count;
    }

    public static int paths(int rows,int cols,int cr,int cc,int[][] dp){
        if(cr == rows - 1 && cc == cols - 1){
            return 1;
        }

        if(cr < 0 || cr >= rows || cc < 0 || cc >= cols){
            return 0;
        }

        if(dp[cr][cc] != 0){ 
            return dp[cr][cc];
        }

        int right = paths(rows,cols,cr,cc+1,dp);
        int left = paths(rows,cols,cr+1,cc,dp);
        dp[cr][cc] = left + right;

        return left + right;

    }
}
}
