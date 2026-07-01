class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        generateParentheses(n,0,0,"",l);
        return l;

        
    }
    private static void generateParentheses(int n,int open,int close,String ans,List<String> l){
        if(n==open && n==close){
            l.add(ans);
            return;

        }
        if(open<n) generateParentheses(n,open+1,close,ans+"(",l);
        if(close<open) generateParentheses(n,open,close+1,ans+")",l);

        
    }
}