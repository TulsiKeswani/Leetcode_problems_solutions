class Solution {
    public int[] findPeakGrid(int[][] nums) {
        // brute force

        // int n = nums.length;
        // int m = nums[0].length;
        // int ans[] = new int[2];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         int val = nums[i][j];

        //         if(
        //             (j == 0 || nums[i][j-1] < val) && 
        //             (j == m-1 || nums[i][j+1] < val) && 
        //             (i == 0 || nums[i-1][j] < val) &&
        //             (i == n-1 || nums[i+1][j] < val)){
        //                 ans[0] = i;
        //                 ans[1] = j;
        //                 return ans;
        //             }
        //     }
        // }

        // return new int[]{-1,-1};

        // optimal 

        int n = nums.length;
        int m =  nums[0].length;
        int low = 0;
        int high = m-1;
        int ans[] = new int[2];
        while(low <= high){
            int mid = low + (high - low) / 2;
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for(int i = 0; i < n; i++){
                if(max < nums[i][mid]){
                    max = nums[i][mid];
                    idx = i;
                }
            }

            int val = nums[idx][mid];

            if((mid == 0 || val > nums[idx][mid-1]) && (mid == m-1 || val > nums[idx][mid + 1])){
                ans[0] = idx;
                ans[1] = mid;
                return ans;
            }
            else if(mid-1 >= 0 && val < nums[idx][mid-1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return new int[]{-1,-1};
    }
}