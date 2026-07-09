class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int lsum = 0;
        int rsum = 0;
        
        // Calculate the initial sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        
        int maxSum = lsum;
        
        // Slide the window by taking elements from the right
        for (int i = 0; i < k; i++) {
            lsum -= arr[k - 1 - i];
            rsum += arr[n - 1 - i];
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        
        return maxSum;
    }
}