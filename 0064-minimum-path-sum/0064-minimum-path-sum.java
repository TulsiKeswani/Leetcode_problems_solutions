class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int prev[] = new int[n];
        prev[n-1] = grid[m-1][n-1];

        for(int j = n-2; j >= 0; j--){
            prev[j] = grid[m-1][j] + prev[j+1];
        }
        
        for(int i = m-2; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(j == n-1){
                    prev[j] = prev[j] + grid[i][j];
                }
                else{
                    prev[j] = grid[i][j] + Math.min(prev[j],prev[j+1]);
                }
            }
        }

        return prev[0];
    }
}