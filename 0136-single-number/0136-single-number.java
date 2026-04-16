class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        if(nums.length==1){
            return nums[0];
        }
     for(int i=0;i<nums.length;i++){
        if(i==0&&nums[i]!=nums[i+1]) {
            a=nums[i];
            break;
        }
        else if(i==nums.length-1&&nums[i]!=nums[i-1]) {
            a=nums[i];
            break;
        }
        else if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]) {
            a=nums[i];
            break;
        }
     
     }return a; 
    }
}
