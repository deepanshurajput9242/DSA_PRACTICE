class Solution {
    public int coinChange(int[] coins, int amount) {

        // dp[i] = minimum coins required to make amount i
        int[] dp = new int[amount + 1];

        // Fill all values with a large number (Infinity)
        Arrays.fill(dp, amount + 1);

        // Base case
        dp[0] = 0;

        // Calculate minimum coins for every amount
        for (int i = 1; i <= amount; i++) {

            // Try every coin
            for (int coin : coins) {

                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If amount cannot be formed
        if (dp[amount] == amount + 1) {
            return -1;
        }

        return dp[amount];
    }
}

// int cnt=0;
//     //     Arrays.sort(coins);
    //     for(int i=coins.length-1;i>=0;i--){
    //         while(amount>=coins[i]){
    //             amount-=coins[i];
    //             cnt++;
    //         }
    //     }
    // if(amount>0)return -1;
    //    return cnt;
