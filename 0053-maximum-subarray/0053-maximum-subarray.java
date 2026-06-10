class Solution {
    public int maxSubArray(int[] nums) {
        // 
        int sum=nums[0];
        int MaxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            MaxSum=Math.max(MaxSum+nums[i],nums[i]);
            sum=Math.max(MaxSum,sum);
        }
        return sum;



       
    }
}


//int MaxSum=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //          MaxSum=Math.max(sum,MaxSum);
        //     }
           
        // }
        // return MaxSum;