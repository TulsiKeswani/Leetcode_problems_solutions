class Solution {
    public int pivotIndex(int[] nums) {
        // brute force
    //    for(int i = 0; i < nums.length; i++){
    //         int lsum = 0;
    //         int rsum = 0;
    //         for(int j = 0; j < i; j++){
    //             lsum+=nums[j];
    //         }
    //         for(int j = i+1; j < nums.length; j++){
    //             rsum+=nums[j];
    //         }

    //         if(lsum == rsum) return i;
    //    }

    //    return -1;

        // better 
        // int n = nums.length;
        // int leftsum[] = new int[n];
        // int rightsum[] = new int[n];
        // leftsum[0] = 0;
        // rightsum[n-1] = 0;

        // for(int i = 1; i < n; i++){
        //     leftsum[i] = leftsum[i-1] + nums[i - 1];
        //     rightsum[n-i-1] = rightsum[n-i] + nums[n-i];
        // }
        
        // for(int i = 0; i < n; i++){
        //     if(leftsum[i] == rightsum[i]) return i;
        // }

        // return -1;

        // optimal

        int n = nums.length-1;
        int total = 0;

        for(int i = 0; i <= n; i++){
            total+=nums[i];
        }

        int lsum = 0;
        for(int i = 0; i <= n; i++){
            
            if(lsum == (total - lsum - nums[i])) return i;
            lsum+=nums[i];
        }

        return -1;
    }
}