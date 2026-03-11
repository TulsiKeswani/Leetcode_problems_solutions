class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // brute force
        // int ans = 0;
        // int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     int oddCount = 0;
        //     for(int j = i; j < n; j++){
        //         if(nums[j] % 2 != 0) oddCount++;

        //         if(oddCount == k) ans++;
        //         else if(oddCount > k) break;
        //     }
        // }

        // return ans;

        int i = 0;
        int j = 0;
        int ans = 0;
        int oddCount = 0;
        int st = -1;

        while(j < nums.length){
            if(nums[j] % 2 != 0) {
               st = st == -1 ? j : st;
               oddCount++;
            };

            if(oddCount > k){
                i = st+1;
                while(oddCount > k) {
                    st++;
                    if(nums[st] % 2 != 0){
                        oddCount--;
                    }
                };
            }
            if(oddCount == k){
                ans = ans + (st - i + 1);
            }
            j++;
        }

        return ans;
    }
}