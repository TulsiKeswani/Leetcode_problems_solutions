class Solution {
    public int findPeakElement(int[] nums) {
        // brute force
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if((i == n-1 || nums[i] > nums[i+1]) && (i == 0 || nums[i] > nums[i-1])){
                return i;
            }
        }
        return -1;
    }
}