class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low=0;
        int high=k-1;
        int cnt=0;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=arr[i];
        }
        while(high<arr.length){
           if(sum/k>=threshold){
            cnt++;
           }
           if(high==arr.length-1)break;
           sum-=arr[low];
            low++;
            high++;

            sum+=arr[high];

        }
        return cnt;
        
    }
}