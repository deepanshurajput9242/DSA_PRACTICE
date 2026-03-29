import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] dp = new int[n];       // dp[i] = size of subset ending at i
        int[] prev = new int[n];     // to reconstruct subset

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLen = 1;
        int lastIndex = 0;

        // DP computation
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        // Reconstruct subset
        List<Integer> result = new ArrayList<>();
        while (lastIndex != -1) {
            result.add(nums[lastIndex]);
            lastIndex = prev[lastIndex];
        }

        Collections.reverse(result);
        return result;
    }
}
