class NumArray {
    private int prefixArr[];
    public NumArray(int[] nums) {
        prefixArr = new int[nums.length];
        prefixArr[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixArr[i] = prefixArr[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        
        return left == 0 ? prefixArr[right] : prefixArr[right] - prefixArr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */