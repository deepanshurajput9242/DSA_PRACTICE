class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr=new int[Math.min(nums1.length,nums2.length)];
        Arrays.sort(nums1);
Arrays.sort(nums2);
         int i=0;
         int j=0;
         int idx=0;
         while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
                
            }
            else if(nums1[i]>nums2[j]){
                j++;
                
            }
            else  {
                arr[idx]=nums1[i];
                i++;
                j++;
                idx++;
            }
              

         }
         return Arrays.copyOf(arr, idx);
    }
}