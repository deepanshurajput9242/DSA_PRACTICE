class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int[] result=new int[m+n];
        int k=0;


        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                result[k]=nums1[i];
                i++;
            }else{
                result[k]=nums2[j];
                j++;
            }
            k++;
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
        for(int q=0;q<result.length;q++){
          nums1[q] = result[q];
        }

    }
}