class Solution {
    public int diagonalSum(int[][] mat) {

        // Optimal ---> O(n)

        int sum = 0;
        int n = mat.length - 1;
        for(int i = 0; i <=n; i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i];
        }

        return n % 2 != 0 ? sum : sum - mat[n/2][n/2];


        // Brute force Approach (n ^ 2)
        // int sum = 0;

        // for(int i = 0; i < mat.length; i++){
        //     for(int j = 0; j < mat[i].length; j++){

        //         if(i == j || (i + j) == mat.length-1){
        //             sum+=mat[i][j];
        //         }
        //     }
        // }

        // return sum;

    }
}