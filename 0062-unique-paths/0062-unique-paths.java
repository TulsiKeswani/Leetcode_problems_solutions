class Solution {
    
    // public int uniquePathsUtil(int i, int j, int m, int n){
    //     if(i >= m || j >= n){
    //         return 0;
    //     }

    //     if( i == m-1 && j == n-1){
    //         return 1;
    //     }
    //     int downPaths = uniquePathsUtil(i+1,j,m,n);
    //     int rightPaths = uniquePathsUtil(i,j+1,m,n);
    //     return downPaths + rightPaths;
    // }
    public int uniquePaths(int m, int n) {
        // int arr[][] = new int[m][n];

        // for(int i = m-1; i >= 0; i--){
        //     for(int j=n-1; j >= 0; j--){
        //         if(i == m-1 && j == n-1){
        //             arr[i][j] = 1;
        //             continue;
        //         }
        //         int right = j != n-1 ? arr[i][j+1] : 0;
        //         int down =  i != m-1 ? arr[i+1][j] : 0;
        //         arr[i][j] = down + right;
        //     }
        // }

        // return arr[0][0];

        int prev[] = new int[n];
        int curr[] = new int[n];

        Arrays.fill(prev,1);

        for(int i = m-2; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(j == n-1){
                    curr[j] = prev[j];
                }
                else{
                    curr[j] = prev[j] + curr[j+1];
                }
            }

            prev = curr;
        }

        return prev[0];
    }
}