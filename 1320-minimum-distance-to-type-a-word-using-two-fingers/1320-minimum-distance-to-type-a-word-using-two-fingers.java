class Solution {
    public int minimumDistance(String word) {
        int n = word.length();
        int[][] dp = new int[27][27];
        
        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 27; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        dp[26][26] = 0;
        
        for (char c : word.toCharArray()) {
            int cur = c - 'A';
            int[][] next = new int[27][27];
            
            for (int i = 0; i < 27; i++) {
                for (int j = 0; j < 27; j++) {
                    next[i][j] = Integer.MAX_VALUE;
                }
            }
            
            for (int f1 = 0; f1 < 27; f1++) {
                for (int f2 = 0; f2 < 27; f2++) {
                    if (dp[f1][f2] == Integer.MAX_VALUE) continue;
                    
                    int cost1 = dp[f1][f2] + dist(f1, cur);
                    if (cost1 < next[cur][f2]) {
                        next[cur][f2] = cost1;
                    }
                    
                    int cost2 = dp[f1][f2] + dist(f2, cur);
                    if (cost2 < next[f1][cur]) {
                        next[f1][cur] = cost2;
                    }
                }
            }
            
            dp = next;
        }
        
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 27; j++) {
                res = Math.min(res, dp[i][j]);
            }
        }
        
        return res;
    }
    
    private int dist(int a, int b) {
        if (a == 26) return 0;
        int x1 = a / 6, y1 = a % 6;
        int x2 = b / 6, y2 = b % 6;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}