class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long tot_sum = 0;
        int n = nums.length;
        for(int i = 0; i < k; i++){
            tot_sum += Math.max((mul * 1L) * nums[n-i-1],nums[n-i-1]);

            mul--;
        }

        return tot_sum;
    }
}