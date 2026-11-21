class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lmb[] = new int[n];
        int rmb[] = new int[n];

        lmb[0] = height[0];
        rmb[n-1] = height[n-1];

        // calculate leftMaxBoundary
        for(int i = 1; i < n; i++){
            lmb[i] = Math.max(height[i],lmb[i-1]);
        }

        // calculate rightMaxBoundary
        for(int i = n-2; i >= 0; i--){
            rmb[i] = Math.max(rmb[i+1],height[i]);
        }

        int totWater = 0;
        // calculate water
        for(int i = 0; i < n; i++){
            totWater+=(Math.min(rmb[i],lmb[i]) - height[i]);
        }

        return totWater;
    }
}