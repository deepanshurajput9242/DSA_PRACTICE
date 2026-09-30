class Solution {
    public int[] sortArrayByParity(int[] nums) {
     
    // 
    int i=0;
    int j=nums.length-1;
    while(i<j){
        if(nums[i]%2!=0 && nums[j]%2==0){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        if(nums[i]%2==0){
            i++;
        }
        if(nums[j]%2!=0){
            j--;
        }

    }
    return nums;

        
    }
}
//    int slow=0;//
    //    int fast=0;
    //    while(fast<nums.length){
    //     if(nums[fast]%2!=0){
    //         fast++;
    //     }
    //     else{
    //         int temp=nums[fast];
    //         nums[fast]=nums[slow];
    //         nums[slow]=temp;
    //         slow++;
    //         fast++;
    //     }

    //    }
    //    return nums;