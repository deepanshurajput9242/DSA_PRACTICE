import java.util.*;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }

        return ways(0, m-1, 0, n-1, dp);
    }

    public static int ways(int cr, int er, int cc, int ec, int[][] dp){
        if(cr == er && cc == ec) return 1;

        if(cr > er || cc > ec) return 0;

        if(dp[cr][cc] != -1) return dp[cr][cc];

        int down = ways(cr + 1, er, cc, ec, dp);
        int right = ways(cr, er, cc + 1, ec, dp);

        return dp[cr][cc] = down + right;
    }
}