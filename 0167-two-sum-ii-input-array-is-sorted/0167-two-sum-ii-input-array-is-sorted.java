class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int lookingFor=target-numbers[i];
            if(hash.containsKey(lookingFor)){
                return new int[]{(hash.get(lookingFor))+1,i+1};

            }
            hash.put(numbers[i],i);
        }
        return new int[]{-1,-1};
        
    }
}