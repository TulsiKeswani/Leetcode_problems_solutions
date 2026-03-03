class Solution {
    public boolean isFormed(int nums[],int k,long minsum){
        int subA = 1;
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            if((sum + nums[i]) > minsum){
                subA++;
                sum = nums[i];
            }
            else{
                sum+=nums[i];
            }
        }

        return subA <= k;
    }
    public int splitArray(int[] nums, int k) {
        long min = Long.MIN_VALUE;
        long max = 0;
        int n =  nums.length;
        for(int i = 0; i < n; i++){
            min = Math.max(nums[i],min);
            max+=nums[i];
        }
        if(k == n) return (int)min;

        while(min <= max){
            System.out.println("Hii");
            long mid = min + (max - min) / 2;
            System.out.println(mid);
            if(isFormed(nums,k,mid)){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }

        return (int)min;
    }
}