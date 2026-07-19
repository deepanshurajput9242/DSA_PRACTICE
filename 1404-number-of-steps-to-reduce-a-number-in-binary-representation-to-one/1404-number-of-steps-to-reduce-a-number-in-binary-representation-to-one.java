class Solution {
    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;

        // Last bit se second bit tak traverse karo
        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';

            if (bit + carry == 1) {
                // Odd number: +1 and /2
                steps += 2;
                carry = 1;
            } else {
                // Even number: only /2
                steps += 1;
            }
        }

        // Agar carry bacha hai to ek extra step lagega
        return steps + carry;
    }
}