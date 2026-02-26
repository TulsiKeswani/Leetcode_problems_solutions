class Solution {
    public boolean isLess(int nums[],int t,int mid){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int val = (int)Math.ceil((double)nums[i] / mid);
            sum+=val;
        }

        return sum <= t;
    }
    public int smallestDivisor(int[] nums, int t) {
        int low = 1;
        int high = -1;
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            high = Math.max(high,nums[i]);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isLess(nums,t,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }
}