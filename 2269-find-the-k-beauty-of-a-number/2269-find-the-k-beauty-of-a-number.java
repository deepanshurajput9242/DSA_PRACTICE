class Solution {
    public int divisorSubstrings(int num, int k) {
        int cnt=0;
        int low=0;
        int high=k-1;
        String s=Integer.toString(num);
       while(high<s.length()){
       String value=s.substring(low,high+1);
        int num1=Integer.parseInt(value);
        if(num1!=0 && num%num1==0){
            cnt++;
            
        }
        low++;
        high++;

       }
       return cnt;

        
    }
}