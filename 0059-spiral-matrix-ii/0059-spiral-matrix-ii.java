class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n - 1;
        int k = 1;
        int arr[][] = new int[n][n];

        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                arr[top][j] = k;
                k++;
            }

            for(int i = top+1; i <= bottom; i++){
                arr[i][right] = k;
                k++;
            }

            for(int j = right-1; j >= left; j--){
                if(top >= bottom) break;
                arr[bottom][j] = k;
                k++;
            }

            for(int i = bottom - 1; i >= top + 1; i--){
                if(left >= right) break;
                arr[i][left] = k;
                k++;
            }
            for(int i = 0; i < arr.length; i++){
                System.out.println(Arrays.toString(arr[i]));
            }
            top++;
            left++;
            right--;
            bottom--;
        }

        return arr;
    }
}