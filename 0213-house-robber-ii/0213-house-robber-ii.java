class Solution {
    public int rob(int[] nums) {
       
        int n=nums.length;
         if(n==1)return nums[0];
        int[] dp1=new int[nums.length];
         int[] dp2=new int[nums.length];
         Arrays.fill(dp1,-1);
         Arrays.fill(dp2,-1);
         return Math.max(amount(nums,0,n-2,dp1),amount(nums,1,n-1,dp2));
        
        
    }
    public  int amount(int[] nums,int i,int end,int[]dp){
        if(i>end)return 0;
        if(dp[i]!=-1) return dp[i];
        int takes=nums[i]+amount(nums,i+2,end,dp);
        int skip=amount(nums,i+1,end,dp);
        return dp[i]= Math.max(takes,skip);

       

    }
}