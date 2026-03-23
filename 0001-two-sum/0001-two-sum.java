class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
 






















 //    int st=0;
//    int end=nums.length-1;
//    int sum=nums[st]+nums[end];
//    while(st<end){
//     if(sum==target){
//         return new int[]{st,end};
//     }else if(sum<target) st++;
//     else{
//         end--;
//     }
   
//    }
//     return new int[]{-1,-1};
//  }
// }
// Map<Integer, Integer> map = new HashMap<>(); // value -> index

        // for (int i = 0; i < nums.length; i++) {
        //     int complement = target - nums[i];

        //     if (map.containsKey(complement)) {
        //         return new int[]{map.get(complement), i};
        //     }
        //     map.put(nums[i], i);
        // }
        // return new int[]{}; // no solution

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target)return new int[]{i,j};
        //     }
        // }
        // return new int[]{-1,-1};

    // int st = 0;
    // int end = nums.length - 1;

    // while (st < end) {
    //     int sum = nums[st] + nums[end];

    //     if (sum == target) {
    //         return new int[]{st, end};
    //     } else if (sum > target) {
    //         end--;
    //     } else {
    //         st++;
    //     }
    // }
    // return new int[]{-1, -1};
