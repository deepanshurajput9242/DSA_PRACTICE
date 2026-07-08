class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1;
        int end = 0;
       
        for (int p : piles) if (p > end) end = p;

        while (st < end) {
            int mid = st + (end - st) / 2;
            long hours = 0;
            for (int pile : piles) {
               
                hours += (pile + (long)mid - 1) / mid;
                if (hours > h) break; 
            }

            if (hours <= h) {
                end = mid; 
            } else {
                st = mid + 1; 
            }
        }
        return st;
    }
}
