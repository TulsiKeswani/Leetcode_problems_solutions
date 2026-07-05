class Solution {
    public int maxDigitRange(int[] nums) {
        
        int digitDiff[] = new int[10];

        for(int i = 0; i < nums.length; i++){
            int maxDigit = Integer.MIN_VALUE;
            int minDigit = Integer.MAX_VALUE;
            int digit = nums[i];

            while(digit != 0){
                int ld = digit % 10;
                maxDigit = Math.max(maxDigit,ld);
                minDigit = Math.min(minDigit,ld);

                digit/=10;
            }

            digitDiff[maxDigit-minDigit]+=nums[i];
        }

      
        for(int i = digitDiff.length-1; i >= 0; i--){
            if(digitDiff[i] != 0){
              return digitDiff[i];
            }
        }

        return 0;
    }
}