class Solution {
    public int minSwaps(int[] nums) {
        int noOf1 = 0;
        int minSwap = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                noOf1++;
            }
        }

        if(noOf1 == 0) return 0;

        int i = 0;
        int j = 0;
        int zeroCount = 0;;
        while(i < nums.length){

            if(nums[j % nums.length] == 0){
               zeroCount++;
            }

            if(j-i+1 == noOf1){
                minSwap = Math.min(minSwap,zeroCount);
                if(nums[i] == 0){
                    zeroCount--;
                }
                i++;
            }

            j++;
        }

        return minSwap;
    }
}