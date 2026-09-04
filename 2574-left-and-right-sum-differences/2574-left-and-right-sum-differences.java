class Solution {
    public int[] leftRightDifference(int[] nums) {
        // int[] answer=new int[nums.length];
        // int[] leftSum=new int[nums.length];
        // int[] rightSum=new int[nums.length];
        // leftSum[0]=0;
        // rightSum[nums.length-1]=0;
        // int leftSumo=0;
        // int rightSumo=0;

        // for(int i=1;i<nums.length;i++){

        //     leftSumo+=nums[i-1];
        //     leftSum[i]=leftSumo;

        // }
        // for(int i=nums.length-2;i>=0;i--){
        //     rightSumo+=nums[i+1];
        //     rightSum[i]=rightSumo;
        // }
        // for(int i=0;i<nums.length;i++){
        //     answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        // }
     int[] ans=new int[nums.length];
     int total=0;
     for(int i=0;i<nums.length;i++){
        total+=nums[i];
     }
     int leftSum=0;
     for(int i=0;i<nums.length;i++ ){
        int rightSum=total-leftSum-nums[i];
        ans[i]=Math.abs(rightSum-leftSum);
        leftSum+=nums[i];
     }
     






        
        return ans;
        
    }
}