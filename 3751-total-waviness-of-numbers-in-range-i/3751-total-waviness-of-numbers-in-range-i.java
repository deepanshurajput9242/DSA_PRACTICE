class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int x = num1; x <= num2; x++) {
            ans += waviness(x);
        }

        return ans;
    }

    private int waviness(int x) {
        int[] digits = new int[10];
        int len = 0;

        while (x > 0) {
            digits[len++] = x % 10;
            x /= 10;
        }

        if (len < 3) {
            return 0;
        }

        int count = 0;

        for (int i = 1; i < len - 1; i++) {
            if ((digits[i] > digits[i - 1] && digits[i] > digits[i + 1]) ||
                (digits[i] < digits[i - 1] && digits[i] < digits[i + 1])) {
                count++;
            }
        }

        return count;
    }
}