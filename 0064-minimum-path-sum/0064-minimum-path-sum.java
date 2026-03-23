class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0&& j==0) dp[i][j]=grid[i][j];
                else if(i==0) dp[i][j]=grid[i][j]+dp[i][j-1];
                else if(j==0) dp[i][j]=grid[i][j]+dp[i-1][j];
                else {
                    dp[i][j]=grid[i][j]+Math.min(dp[i][j-1],dp[i-1][j]);

                }
            }
        }
        return dp[m-1][n-1];
    //    
    }
}




// for(int i=0;i<m;i++){
    //         Arrays.fill(dp[i],-1);
    //     }
    //     return minSum(0,0,m-1,n-1,dp,grid);


        
    // }


   // public static int minSum(int cr,int cc, int er, int ec,int[][] dp,int[][] grid){
    //     if(cr==er && cc==ec) return grid[cr][cc];
    //     if(cr>er|| cc>ec) return Integer.MAX_VALUE;
    //     if(dp[cr][cc]!=-1)return dp[cr][cc];
    //     int right=minSum(cr+1,cc,er,ec,dp,grid);
    //     int down=minSum(cr,cc+1,er,ec,dp,grid);
    //     return dp[cr][cc]=Math.min(right,down)+grid[cr][cc];

    // }