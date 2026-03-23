class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // int ans = -1;
        // int n = gas.length;
        // for(int i = 0; i < n; i++){
        //     int g = 0;
        //     if(gas[i] < cost[i]) continue;
        //     for(int j = i; j < n+i; j++){

        //         g+=gas[(j + n) % n];
        //         g-=cost[(j + n) % n];

        //         if(g < 0) break;
        //     }

        //     if(g >= 0){
        //         ans = i;
        //         break;
        //     }
        // }

        // return ans;
        int totGas = 0;
        int totCost = 0;
        int ans = 0;
        int n = gas.length;
        int sum = 0;
        for(int i = 0; i < n;i++){
            sum+=gas[i] - cost[i];
            totGas += gas[i];
            totCost += cost[i];

            if(sum < 0){
                ans = i+1;
                sum = 0;
            }
        }

        return totGas < totCost ? -1 : ans;
    }
}