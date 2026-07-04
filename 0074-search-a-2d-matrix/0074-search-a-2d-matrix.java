class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // Optimal approach --> 

        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }

        return false;

        // // Brute force approach  --> O(n ^ 2)


        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){

        //         if(matrix[i][j] == target) return true;
        //     }
        // }

        // return false;
    }
}