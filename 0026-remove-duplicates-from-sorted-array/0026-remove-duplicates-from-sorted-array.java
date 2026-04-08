class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }

        }
        return i+1;
   
   
   
   
   
   
   
   
   }


 //     HashSet<Integer> set=new HashSet<>();
    //     int index=0;
    //     for(int num:nums){
    //         if(!set.contains(num)){
    //             set.add(num);
    //             nums[index]=num;
    //             index++;
    //         }
    //     }
    //     return index;

    // 



























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
   
}