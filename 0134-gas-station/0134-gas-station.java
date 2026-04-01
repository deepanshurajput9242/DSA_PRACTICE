class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost=0;
        int totalgas=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalcost>totalgas)return -1;
        int remaingas=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            remaingas=remaingas+(gas[i]-cost[i]);
            if(remaingas<0){
                start=i+1;
                remaingas=0;
            }
        }
        return start;
        
    }
}