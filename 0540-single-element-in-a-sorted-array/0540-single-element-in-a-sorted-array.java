class Solution {
    public int singleNonDuplicate(int[] nums) {
        // // solution 1 --> Brute force (linear traversal)
        // for(int i = 0; i < nums.length; i+=2){
        //     if(i == nums.length-1 || nums[i] != nums[i+1]) return nums[i];
        // }

        // return nums[0];

        // solution 2 --> xor operator
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }

        return xor;
    }
}