class Solution {
    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // Length = 2
        for (int i = 0; i < m; i++) {
            up[i] = i;
            down[i] = m - 1 - i;
        }

        for (int len = 3; len <= n; len++) {

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            // Prefix sums for down
            long[] prefix = new long[m];
            prefix[0] = down[0];
            for (int i = 1; i < m; i++) {
                prefix[i] = (prefix[i - 1] + down[i]) % MOD;
            }

            // Suffix sums for up
            long[] suffix = new long[m];
            suffix[m - 1] = up[m - 1];
            for (int i = m - 2; i >= 0; i--) {
                suffix[i] = (suffix[i + 1] + up[i]) % MOD;
            }

            for (int i = 0; i < m; i++) {
                if (i > 0)
                    newUp[i] = prefix[i - 1];

                if (i + 1 < m)
                    newDown[i] = suffix[i + 1];
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }
}