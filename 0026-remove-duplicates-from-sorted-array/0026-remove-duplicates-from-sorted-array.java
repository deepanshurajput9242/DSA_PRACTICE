class Solution {
    public int removeDuplicates(int[] nums) {
        
         int i=0;
         int j=1;
         int cnt=1;
         while(j<nums.length){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }
            else if(nums[j]!=nums[j-1]){
                nums[i+1]=nums[j];
                i++;
                j++;
                cnt++;
            }
         }
         return cnt;
   
   
   
   
   
   
   
   }

}
 


























        // int officer=0;
        // int cm=1;
        // int res=1;
        // while(cm<nums.length){
        //     if(nums[cm]==nums[cm-1]){
        //         cm++;
        //         continue;
        //     }
        //     nums[officer+1]=nums[cm];
        //     cm++;
        //     officer++;
        //     res++;
        // }
        // return res;
    // int i=0;
    // for(int j=1;j<nums.length;j++){
    //     if(nums[j]!=nums[j-1]){
    //         i++;
    //         nums[i]=nums[j];
    //     }
     
    // }
    // return i+1; 
    // }
   
 