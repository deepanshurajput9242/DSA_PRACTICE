class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt=0;
       int low=0;
       int right=k-1;
       int avSum=0;
       for(int i=low;i<=right;i++){
        avSum+=arr[i];
       }
       while(right<arr.length){
        
        if(avSum/k>=threshold) cnt++;
          if(right==arr.length-1)break;

        avSum-=arr[low];
        low++;
        right++;
        avSum+=arr[right];
      
       }
       return cnt;
//       
    }
}