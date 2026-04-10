class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int l=i+1,r=n-1;
            int s=(-1*nums[i]);
            while(l<r){
                int sum=nums[l]+nums[r];
                if(sum==s){
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1])l++;
                    while(l<r && nums[r]==nums[r+1])r--;
                }else if(sum<s){l++;
                }

            else{
                r--;
            }
        }
        }
      return list;   
    }
   
}