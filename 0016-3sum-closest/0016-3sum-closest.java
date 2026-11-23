class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        // for(int i = 0; i < nums.length-2; i++){
        //     for(int j = i+1; j < nums.length-1; j++){
        //         for(int k = j+1; k < nums.length; k++){
        //             int sum = nums[i] + nums[j] + nums[k];

        //             if(diff > Math.abs(target - sum)){
        //                 ans = sum;
        //                 diff = Math.abs(target - sum);
        //             }
        //         }
        //     }
        // }

        // return ans;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            if(i != 0 && nums[i] == nums[i-1]) continue;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(diff > Math.abs(sum - target)){
                    diff = Math.abs(sum - target);
                    ans = sum;
                }

                if(sum == target) return sum;
                if(sum > target){
                    k--;
                    while(k > j && nums[k] == nums[k+1]) k--;
                }
                else{
                    j++;
                    while(j < k && nums[j] == nums[j-1]) j++;
                }
            }
        }

        return ans;
    }
}