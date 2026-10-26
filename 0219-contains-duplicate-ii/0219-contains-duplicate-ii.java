class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> hash=new HashSet<>();

        for(int i=0;i<Math.min(nums.length,k);i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
        }


        for(int i=k;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
            hash.remove(nums[i-k]);
        }
        
        return false;
    }
}