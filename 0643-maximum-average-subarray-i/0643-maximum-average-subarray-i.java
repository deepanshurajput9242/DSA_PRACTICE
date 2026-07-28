class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=k-1;


        int avSum=0;
        double maxSum=0;
        for(int i=left;i<=right;i++){
            avSum+=nums[i];
        }
        maxSum=avSum;
        while(right<nums.length){
            if(right==nums.length-1) break;
            avSum-=nums[left];
            left++;
            right++;
            avSum+=nums[right];

            maxSum=Math.max(avSum,maxSum);



        
        }
        return maxSum/k;


        
    }
}