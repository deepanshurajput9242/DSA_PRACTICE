class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int high = 0; high < nums.length; high++) {

            // Expand the window
            sum += nums[high];

            // Shrink the window until it becomes invalid
            while (sum >= target) {

                minLen = Math.min(minLen, high - low + 1);

                sum -= nums[low];
                low++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}