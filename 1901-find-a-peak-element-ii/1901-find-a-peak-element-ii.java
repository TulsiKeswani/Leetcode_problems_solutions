class Solution {
    public int[] findPeakGrid(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int ans[] = new int[2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int val = nums[i][j];

                if(
                    (j == 0 || nums[i][j-1] < val) && 
                    (j == m-1 || nums[i][j+1] < val) && 
                    (i == 0 || nums[i-1][j] < val) &&
                    (i == n-1 || nums[i+1][j] < val)){
                        ans[0] = i;
                        ans[1] = j;
                        return ans;
                    }
            }
        }

        return new int[]{-1,-1};
    }
}