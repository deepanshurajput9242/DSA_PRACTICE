class Solution {
    public boolean stoneGame(int[] piles) {

        int n = piles.length;
        int[][] dp = new int[n][n];

        // Only one pile
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        // Calculate for bigger ranges
        for (int i = n - 2; i >= 0; i--) {

            for (int j = i + 1; j < n; j++) {

                int left = piles[i] - dp[i + 1][j];

                int right = piles[j] - dp[i][j - 1];

                dp[i][j] = Math.max(left, right);
            }
        }

        return dp[0][n - 1] > 0;
    }
}