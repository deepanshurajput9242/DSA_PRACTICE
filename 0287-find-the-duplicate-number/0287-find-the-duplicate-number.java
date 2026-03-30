class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer Key:map.keySet()){
            if(map.get(Key)>1)
            return Key;
        }
        return -1;
        
    }
}