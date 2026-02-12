class Solution {
    public int maxProfit(int[] nums) {
        int maxp = 0;
        int bp = nums[0];

       for(int i = 1; i < nums.length; i++){
            if(nums[i] > bp){
                maxp+=(nums[i] - bp);
                bp = nums[i];
            }
            else{
                bp = nums[i];
            }
       } 

       return maxp;
    }
}