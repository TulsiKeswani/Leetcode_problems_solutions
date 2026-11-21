class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int rmb[] = new int[n];
        int leftMax = height[0];

        // calculate leftMaxBoundary And rightMaxBoundary
        rmb[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rmb[i] = Math.max(height[i],rmb[i+1]);
        }

        int totWater = 0;
        // calculate water
        for(int i = 0; i < n; i++){
            leftMax = Math.max(height[i],leftMax);
            totWater+=(Math.min(rmb[i],leftMax) - height[i]);
        }

        return totWater;
    }
}



