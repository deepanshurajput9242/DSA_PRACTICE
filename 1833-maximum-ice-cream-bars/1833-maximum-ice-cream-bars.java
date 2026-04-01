class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(coins>=costs[i]){
            coins-=costs[i];
            count++;
            }else {
               break;
            }
        }
        return count;
        
    }
}