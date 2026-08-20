class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
      int  k=0;
      int[] result=new int[m+n];
      while(i<m && j<n){
        if(nums1[i]<nums2[j]){
        result[k]=nums1[i];
        i++;
        k++;



        }

        else{
            
            result[k]=nums2[j];
            j++;
            k++;

        }
       
        
      } 
       while(i<m){
            result[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            result[k]=nums2[j];
            j++;
            k++;
        }
      for(int l=0;l<result.length;l++){
        nums1[l]=result[l];     
      }
    }
}