class Solution {
    public int findNumbers(int[] nums) {
     int cnt=0;

     for(int num:nums){
        int sumOfDigit=0;
        while(num>0){
            int digit=num%10;
            sumOfDigit+=1;
            num=num/10;

            
        }
        if(sumOfDigit%2==0){
            cnt++;
        }
     }
     return cnt;
    
    }
}
// class Solution {
//     public int findNumbers(int[] nums) {
//      int cnt=0;
//      int sumOfDigit=0;
//      for(int i=0;i<nums.length;i++){
//         int digit=nums[i]%10;
//         sumOfDigit+=1;
//         nums[i]=nums[i]/10;

//         if(sumOfDigit%2==0){
//             cnt++;
//         }

//      }
//       return cnt;
//     }
// }