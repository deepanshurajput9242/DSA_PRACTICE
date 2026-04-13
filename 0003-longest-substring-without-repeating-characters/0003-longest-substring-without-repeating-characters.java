class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length()<=1)
        // return s;
        // String LPS="";
        // for(int i=0;i<s.length();i++){
        //     int low=i;
        //     int high =i;
        //     while(s.charAt(low)==s.charAt(high)){
        //         low--;
        //         high++;
        //         if(low==-1 || high ==s.length())
        //         break;


        //     }
        //     String palindrome=s.substring(low+1,high);
        //     if(palindrome.length()>LPS.length()){
        //         LPS=palindrome;
        //     }
        //     low=i-1;
        //     high=i;
        //     while(s.charAt(low)==s.charAt(high)){
        //         low--;
        //         high++;
        //         if(low==-1||high==s.length())
        //         break;
        //     }
        //     palindrome=s.substring(low+1,high);
        //     if(palindrome.length()>LPS.length()){
        //         LPS=palindrome;
        //     }
        // }
        // return LPS;
        // int n=s.length();
        // int maxLength=0;
        // for(int i=0;i<n;i++){
        //     HashSet<Character> set=new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         char c=s.charAt(j);
        //         if(set.contains(c)) break;
        //          set.add(c);
        //     maxLength=Math.max(maxLength,j-i+1);
        //     }
        int left=0;
        int maxLen=0;
        HashMap<Character,Integer> hash=new HashMap<>();

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(hash.containsKey(ch)){
                left=Math.max(left,hash.get(ch)+1);


            }
            hash.put(ch,right);
            maxLen=Math.max(maxLen,right-left+1);

        }

        
        return maxLen;
        
    }
}