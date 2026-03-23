class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
       return mazePath(0,0,m-1,n-1,dp);

        
    }
    private static int mazePath(int cr,int cc,int er,int ec,int[][] dp){
        if(cr==er && cc==ec){
            return 1;

        }
        if(cr>er||cc>ec) return 0;
        if(dp[cr][cc]!=0)return dp[cr][cc];
        int n1=mazePath(cr+1,cc,er,ec,dp);
        int n2=mazePath(cr,cc+1,er,ec,dp);
        return dp[cr][cc]= n1+n2;
    }
}