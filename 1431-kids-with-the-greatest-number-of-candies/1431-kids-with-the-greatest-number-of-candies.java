class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int maxEle=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>maxEle){
                maxEle=candies[i];


            }
            
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxEle){
                l.add(true);
            }
            else{
                l.add(false);
            }

        }
        return l;
    }
}