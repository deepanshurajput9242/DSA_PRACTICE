class Solution {
    public int numIdenticalPairs(int[] nums) {
        int finalCnt=0;
        int[] countArr=new int[101];
        for(int num:nums){
            countArr[num]++;

        }
        for(int cnt:countArr){
            cnt=cnt*(cnt-1)/2;
            finalCnt+=cnt;
        }
        return finalCnt;

    }
}