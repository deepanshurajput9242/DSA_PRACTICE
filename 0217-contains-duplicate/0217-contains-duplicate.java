class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> Hash=new HashSet<>();
        for(int num:nums){
            if(Hash.contains(num))return true;
            Hash.add(num);
        }
        return false;
        
    }
}