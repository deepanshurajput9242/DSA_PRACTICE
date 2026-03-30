class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int preMax=0;
        int time=0;

        for(int i=0;i<n;i++){
            int curr=neededTime[i];
            if(i>0 && colors.charAt(i)!=colors.charAt(i-1)){
                preMax=0;
            }
            time+=Math.min(preMax,curr);
            preMax=Math.max(preMax,curr);
        }
        return time;

        
    }
}