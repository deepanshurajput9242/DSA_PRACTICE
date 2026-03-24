class Solution {
    public int uniquePaths(int m, int n) {
        int [][] dp=new int[2][n];
        for(int j=0;j<n;j++){
            dp[0][j]=1;
            dp[1][j]=1;

        }
        for(int i=1;i<=m-1;i++){
            if(i%2==1){
                for(int j=1;j<n;j++){
                    dp[1][j]=dp[1][j-1]+dp[0][j];
                }
            }
            else{
                for(int j=1;j<n;j++){
                    dp[0][j]=dp[0][j-1]+dp[1][j];
                }
            }
        }
        return Math.max(dp[1][n-1],dp[0][n-1]);
        
    }
}







 // public int uniquePaths(int m, int n) {
    //     int[][] dp = new int[m][n];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(i==0 || j==0) dp[i][j]=1;
    //             else {dp[i][j] = dp[i][j-1]+dp[i-1][j];}
    //         }
    //     }
    //     return dp[m-1][n-1];
//  for(int i = 0; i < m; i++){
    //         Arrays.fill(dp[i], -1);
    //     }

    //     return ways(0, m-1, 0, n-1, dp);
    // }

    // public static int ways(int cr, int er, int cc, int ec, int[][] dp){
    //     if(cr == er && cc == ec) return 1;

    //     if(cr > er || cc > ec) return 0;

    //     if(dp[cr][cc] != -1) return dp[cr][cc];

    //     int down = ways(cr + 1, er, cc, ec, dp);
    //     int right = ways(cr, er, cc + 1, ec, dp);

    //     return dp[cr][cc] = down + right;