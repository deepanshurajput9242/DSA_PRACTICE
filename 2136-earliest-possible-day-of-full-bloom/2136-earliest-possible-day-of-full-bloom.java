import java.util.*;

class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        
        int[][] arr = new int[n][2];
        
        // pair banana
        for(int i = 0; i < n; i++){
            arr[i][0] = plantTime[i];
            arr[i][1] = growTime[i];
        }
        
        // sort by growTime (descending)
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        
        int currentDay = 0;
        int result = 0;
        
        for(int i = 0; i < n; i++){
            currentDay += arr[i][0]; // planting time add
            result = Math.max(result, currentDay + arr[i][1]);
        }
        
        return result;
    }
}