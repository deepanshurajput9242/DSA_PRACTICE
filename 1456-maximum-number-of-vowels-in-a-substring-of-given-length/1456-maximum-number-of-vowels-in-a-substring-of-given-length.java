class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxCount = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Remove left character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add new right character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}