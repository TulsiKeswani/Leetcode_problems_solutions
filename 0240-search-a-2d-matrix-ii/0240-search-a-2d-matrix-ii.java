class Solution {
    public boolean binarySearch(int matrix[],int t){
        int st = 0;
        int end = matrix.length-1;

        while(st <= end){
            int mid = st + (end - st) / 2;

            if(matrix[mid] == t){
                return true;
            }
            else if(matrix[mid] < t){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int t) {
        // better --> applying binary search

        // for(int i = 0; i < matrix.length; i++){
        //     if(binarySearch(matrix[i],t)) return true;
        // }

        // return false;

        // best
        int n = matrix.length;
        int m = matrix[0].length;
        int i = n-1;
        int j = 0;

        while(i >= 0 && j <= m-1){
            int val = matrix[i][j];
            if(val == t){
                return true;
            }
            else if(val < t){
                j++;
            }
            else{
                i--;
            }
        }

        return false;
    }
}