class Solution {
    public long sumAndMultiply(int n) {

        int num = n;

        // Sum of digits
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        // Remove zeros
        int ans = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            if (digit != 0) {
                ans = digit * place + ans;
                place *= 10;
            }

            num /= 10;
        }

        return (long) sum * ans;
    }
}