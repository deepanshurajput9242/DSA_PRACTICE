class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        int [] countArr=new int[101];
        for(int num:nums){
            countArr[num]++;
        }
        for(int count:countArr){
            count=count*(count-1)/2;
            cnt+=count;
        }
        return cnt;
    }
}