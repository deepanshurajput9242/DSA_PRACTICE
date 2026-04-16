class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
       int xor=0;

        for(int i=0;i<=n;i++){
            xor=xor^i;
        }
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
        

    //    

    // 





// int sumOfWhole=n*(n+1)/2;
    //     int sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];


    //     }
    //     return (sumOfWhole-sum);
    // }













// int n=nums.length;
    //    int[] hash=new int [n+1];
    //    for(int i=0;i<n;i++){
    //     hash[nums[i]]=1;
        
    //    }
    //    for(int i=0;i<=n;i++){
    //     if(hash[i]==0) return i;
    //    }
    //    return -1;