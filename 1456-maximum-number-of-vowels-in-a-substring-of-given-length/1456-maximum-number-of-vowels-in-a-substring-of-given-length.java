class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int r=0;
        int cnt=0;
        int maxCount=0;
        for(;r<k;r++){
            cnt+=isVowel(s.charAt(r));
        }
        maxCount=cnt;
        while(r<s.length()){
            cnt-=isVowel(s.charAt(l++));
             cnt+=isVowel(s.charAt(r++));
             maxCount=Math.max(cnt,maxCount);
        }
        return maxCount;
    }
    public int isVowel(char ch){
      return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')? 1:0;
    }
}