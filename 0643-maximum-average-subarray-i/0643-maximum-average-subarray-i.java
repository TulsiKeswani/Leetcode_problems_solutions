class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int i = 0;
        // int j = 0;
        // int sum = 0;
        // double maxAvg = Integer.MIN_VALUE;

        // while(j < nums.length){
        //     sum += nums[j];

        //     if(j - i + 1 == k ){
        //         maxAvg = Math.max(maxAvg,(sum) / (k * 1.0));
        //         sum-=nums[i];
        //         i++;
        //     }
        //     j++;
        // }

        // return maxAvg;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum+=nums[i];
        }

        double maxAvg = sum * 1.0 / k;

        for(int i = k; i < nums.length; i++){
            sum-=nums[i-k];
            sum+=nums[i];
            maxAvg = Math.max(maxAvg,sum * 1.0 / k);
        }

        return maxAvg;
    }
}