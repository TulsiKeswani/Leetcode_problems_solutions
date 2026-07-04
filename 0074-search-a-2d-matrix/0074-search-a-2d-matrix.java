class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        // Super Optimal Approach --> Olog(n * m)

        int st = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int end = n*m-1;

        while(st <= end){
            int mid = st + (end - st) / 2 ;

            int row = mid / m;
            int col = mid - (row * m);

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return false;
        // // Optimal approach --> 0(m + n)

        // int row = 0;
        // int col = matrix[0].length-1;

        // while(row < matrix.length && col >= 0){
            
        //     if(matrix[row][col] == target){
        //         return true;
        //     }
        //     else if(matrix[row][col] < target){
        //         row++;
        //     }
        //     else{
        //         col--;
        //     }
        // }

        // return false;

        // // Brute force approach  --> O(n ^ 2)


        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){

        //         if(matrix[i][j] == target) return true;
        //     }
        // }

        // return false;
    }
}