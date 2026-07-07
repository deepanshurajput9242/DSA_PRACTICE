class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int idx=0;
        int[] temp=new int[m+n];
        while(i< m && j< n){
            if(nums1[i]<=nums2[j]){
                temp[idx]=nums1[i];
                i++;
                idx++;
            }
            else if(nums1[i]>=nums2[j]){
                 temp[idx]=nums2[j];
                idx++;
                j++;
            }
        }
        while(i< m){
             temp[idx]=nums1[i];
            idx++;
            i++;
        }
        while(j< n){
             temp[idx]=nums2[j];
            idx++;
            j++;
        }
       
        for ( idx = 0; idx < m + n; idx++) {
            nums1[idx] = temp[idx];
        }

        
        
    }
}