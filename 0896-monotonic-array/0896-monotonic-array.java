class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;

        if(nums[0] <= nums[n-1]){
            for(int i = 0; i<nums.length-1; i++){
                if(nums[i] > nums[i+1]) return false;
            }
        }
        else{
            for(int i = 0; i< nums.length-1; i++){
                 if(nums[i] < nums[i+1]) return false;
            }
        }

        return true;
    }
}