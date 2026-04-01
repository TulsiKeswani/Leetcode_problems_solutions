class Solution {
    // public static int getAllPaths(int n,int curr,String s){
    //     if(curr > n) return 0;
    //     if(n == curr){
    //         return 1;
    //     }
    //     int allPaths = 0;
    //     for(int i = 1; i <= 2; i++){
    //         allPaths+=getAllPaths(n,curr+i,s + i);
    //     }
    //     return allPaths;
    // }

    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        int dp[] = new int[n];

        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n-1];
    }
}