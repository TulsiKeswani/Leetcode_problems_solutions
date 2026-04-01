class Solution {
    public int uniquePaths(int n, int m) {
        // Recursion Solution
        // if(n == 0 || m == 0){
        //     return 0;
        // }
        // if(n == 1 && m == 1){
        //     return 1;
        // }
        
        // int hoz = uniquePaths(n,m-1);
        // int ver = uniquePaths(n-1,m);
        
        // return hoz + ver;

        // Dp version
        int dp[][] = new int[n][m];
        dp[n-1][m-1] = 1;
        for(int i = n-1; i >= 0; i--){
            for(int j = m-1; j >= 0; j--){
                if(i == n-1 && j == m-1) continue;
                int leftPaths = j == m-1 ? 0 : dp[i][j+1];
                int downPaths = i == n-1 ? 0 : dp[i+1][j];
                dp[i][j] = leftPaths + downPaths;
            }
        }
        return dp[0][0];
    }
}