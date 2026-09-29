class Solution {
    public void moveZeroes(int[] arr) {
     

    int[] ans=new int[arr.length];
    int j=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            ans[j]=arr[i];
            j++;
        }

    }
    while(j<arr.length){
        ans[j]=0;
        j++;
    }
    for(int i=0;i<arr.length;i++){
        arr[i]=ans[i];
    }    
    }
}