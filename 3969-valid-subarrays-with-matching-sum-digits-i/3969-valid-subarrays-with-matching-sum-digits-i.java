class Solution {
    public int[] getDigits(long num){
        int lastDigit = (int)(num % 10);
         int firstDigit = lastDigit;
        while(num != 0){
            int ld = (int)(num % 10);
            firstDigit = ld;
            num /= 10;
        }
        return new int[]{firstDigit,lastDigit};
    }
    public int countValidSubarrays(int[] nums, int x) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            long sum = 0;
            for(int j = i; j < nums.length; j++){
                sum+=nums[j];

                int[] digits = getDigits(sum);

                if(digits[0] == x && digits[1] == x) ans++;
            }
        }
        return ans;
    }
}