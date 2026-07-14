class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int high=k-1;
        double sum=0;
        int low=0;
        
        for(  int i=low;i<=high;i++){
            sum+=nums[i];

        }
        double maxSum=sum;
        while(high<nums.length-1){
            sum-=nums[low];
            low++;
             
            high++;
            sum+=nums[high]; 
             
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum/k;
        

        
    }
}