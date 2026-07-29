class Solution {
    public int maxVowels(String s, int k) {
    int l=0;
    int h=k-1;
    int cnt=0;
    int maxCount=0;
    for(int i=l;i<=h;i++){
        cnt+=isVowel(s.charAt(i));
    }
    maxCount=cnt;
    while(h<s.length()){
        cnt-=isVowel(s.charAt(l));
        
        l++;
         if(h==s.length()-1) break;
        h++;
        cnt+=isVowel(s.charAt(h));
       
        maxCount=Math.max(cnt,maxCount);
    }
    return maxCount;





    }
    public int isVowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')return 1;
        return 0;

    }
}