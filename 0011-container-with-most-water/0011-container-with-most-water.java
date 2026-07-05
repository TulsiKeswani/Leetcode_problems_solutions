class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxWater = Integer.MIN_VALUE;

        while(i < j){
            int currWater = Math.min(height[i],height[j]) * (j-i);

            maxWater = Math.max(maxWater,currWater);

            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return maxWater;
    }
}