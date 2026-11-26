class Solution {
    
    public int uniquePathsUtil(int i, int j, int m, int n){
        if(i >= m || j >= n){
            return 0;
        }

        if( i == m-1 && j == n-1){
            return 1;
        }
        int downPaths = uniquePathsUtil(i+1,j,m,n);
        int rightPaths = uniquePathsUtil(i,j+1,m,n);
        return downPaths + rightPaths;
    }
    public int uniquePaths(int m, int n) {
        
        // return uniquePathsUtil(0,0,m,n);

        // dp approach 
        int arr[][] = new int[m][n];

        int i = m-1;
        int j = n-1;
        arr[i][j] = 1;
        for(i = m-1; i >= 0; i--){
            for(j=n-1; j >= 0; j--){
                if(i == m-1 && j == n-1){
                    arr[i][j] = 1;
                    continue;
                }
                int right = j != n-1 ? arr[i][j+1] : 0;
                int down =  i != m-1 ? arr[i+1][j] : 0;
                arr[i][j] = down + right;
            }
        }

        return arr[0][0];
    }
}