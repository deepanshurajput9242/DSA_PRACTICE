class Solution {
    public void moveZeroes(int[] arr) {

     int slow=0,
     fast=0;
    
    while(fast<arr.length){
        if(arr[fast]!=0){
            arr[slow]=arr[fast];
            slow++;
        }
        fast++;

    }
    while(slow<arr.length){
        arr[slow]=0;
        slow++;
    }

    }
}

    // int[] ans=new int[arr.length];
    // int j=0;
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]!=0){
    //         ans[j]=arr[i];
    //         j++;
    //     }

    // }
    // while(j<arr.length){
    //     ans[j]=0;
    //     j++;
    // }
    // for(int i=0;i<arr.length;i++){
    //     arr[i]=ans[i];
    // }    
    // }