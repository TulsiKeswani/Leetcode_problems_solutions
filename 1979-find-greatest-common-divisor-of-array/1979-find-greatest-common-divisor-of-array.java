class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i < nums.length; i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        int gcd = 1;
        for(int i = 2; i <= min; i++){
            while(min % i == 0 && max % i == 0){
                gcd *= i;
                min /= i;
                max /= i;
            }
        }

        return gcd;
    }
}