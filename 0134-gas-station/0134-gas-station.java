class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n=gas.length;
        int total=0;
        int result=0;
        for(int i=0;i<n;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0)return -1;
        total=0;
        for(int i=0;i<n;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                result=i+1;
            }
           
        }
        return result;
      
        
    }
}





  // int curGas=0;
        // int n=gas.length;
        // for(int i=0;i<n;i++){
        //     if(gas[i]<cost[i]){continue;
        //     }
        //     int j=(i+1)%n;
        //     curGas=gas[i]-cost[i]+gas[j];
        //     while(j!=i){
        //         if(curGas<cost[j]){
        //             break;
        //         }
        //         int costForMovingThisJ=cost[j];
        //         j=(j+1)%n;
        //         int gasEarnInNextStationJ=gas[j];
        //         curGas=curGas-costForMovingThisJ+gasEarnInNextStationJ;
                

        //     }
        //     if(j==i){
        //         return i;
        //     }

        // }
        // return -1;