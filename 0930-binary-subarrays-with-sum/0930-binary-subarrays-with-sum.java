class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int j = 0;
        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        int n = nums.length;
        freq.put(0,1);
        while(j < n){
            sum+=nums[j];
            int diff = sum - goal;
            if(freq.containsKey(diff)){
                ans+=freq.get(diff);
            }

            freq.put(sum,freq.getOrDefault(sum,0) + 1);
            j++;
        }

        return ans;

       
    }
}