class Solution {
    public boolean isMonotonic(int[] nums) {
        // Approach 1 --> O(n);

        // int n = nums.length;
        // if(n == 1) return true;

        // if(nums[0] <= nums[n-1]){
        //     for(int i = 0; i<nums.length-1; i++){
        //         if(nums[i] > nums[i+1]) return false;
        //     }
        // }
        // else{
        //     for(int i = 0; i< nums.length-1; i++){
        //          if(nums[i] < nums[i+1]) return false;
        //     }
        // }

        // Approach 2 -->
        boolean inc = true;
        boolean dec = true;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                dec = false;
            }
            else if(nums[i] > nums[i+1]){
                inc = false;
            }

            if(!dec && !inc) return false;
        }

        return true;
    }
}