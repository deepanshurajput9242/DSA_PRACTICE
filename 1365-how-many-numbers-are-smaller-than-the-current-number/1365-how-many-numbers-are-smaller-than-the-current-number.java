class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] count=new int[nums.length];
        int currentNum=nums[0];

     
        for(int i=0;i<nums.length;i++){
               int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && j!=i){
                    cnt++;

                    count[i]=cnt;
                    
                }
             

            }

        }
        return count;
        
    }
}