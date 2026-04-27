class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int max[] = new int[n];
        max[n-1] = Integer.MIN_VALUE;

        for(int i = n-2; i >= 0; i--){
            max[i] =  Math.max(nums[i+1],max[i+1]);
        }
        int leftMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] > leftMax){
                ans.add(nums[i]);
                leftMax = nums[i];
            }
            else if(nums[i] > max[i]){
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}