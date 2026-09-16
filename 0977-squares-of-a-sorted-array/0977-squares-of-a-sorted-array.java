class Solution {
    public int[] sortedSquares(int[] nums) {
        /**
        [-4,-1,0,3,10]
        i           j
                    k

result[]=[           ,100]
        if(Math.abs(nums[i]<nums[j]))result[k]=nums[j]*nums[j];
*/  
   int [] result=new int[nums.length];
   int i=0;
   int j=nums.length-1;
   int k=nums.length-1;
   while(i<=j){
    if(Math.abs(nums[i])<Math.abs(nums[j])){
        result[k]=nums[j]*nums[j];
        j--;
        k--;
    }
    else{
        result[k]=nums[i]*nums[i];
        k--;
        i++;
    }
   }
    // while(i<nums.length){
    //     result[k]=nums[i]*nums[i];
    //     k--;
    //     i++;
    // }
    // while(j>=0){
    //     result[k]=nums[j]*nums[j];
    //     k--;
    //     j--;
    // }
    return result;
   

   

    }
}