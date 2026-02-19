class Solution {
    // public boolean binarySearch(int[] arr, int t){
    //     int st = 0;
    //     int end = arr.length-1;

    //     while(st <= end){
    //         int mid = st +(end - st)/2;
    //         if(arr[mid] == t){
    //             return true;
    //         }
    //         else if(arr[mid] > t){
    //             end = mid-1;
    //         }
    //         else{
    //             st = mid+1;
    //         }
    //     }

    //     return false;
    // }
    public boolean searchMatrix(int[][] matrix, int t) {
        // better approach
        // for(int i = 0; i < matrix.length; i++){
        //     if(binarySearch(matrix[i],target)) return true;
        // }

        // return false;

        // optimal
        int n = matrix.length;
        int m = matrix[0].length;
        int i = n - 1;
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