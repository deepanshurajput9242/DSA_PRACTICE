class Solution {
    public int[] sortedSquares(int[] nums) {
        /**
        [-4,-1,0,3,10]
        i           j
                    k

result[]=[           ,100]
        if(Math.abs(nums[i]<nums[j]))result[k]=nums[j]*nums[j];
*/  

     int[] result=new int[nums.length];
     int k=nums.length-1;
     int i=0;
     int j=nums.length-1;
     while(i<=j){
        if(Math.abs(nums[i])<=Math.abs(nums[j])){
            result[k]=nums[j]*nums[j];
            
            j--;
        }
        else{
            result[k]=nums[i]*nums[i];
            i++;
        }
        k--;
     }
     return result;
       
    }
}