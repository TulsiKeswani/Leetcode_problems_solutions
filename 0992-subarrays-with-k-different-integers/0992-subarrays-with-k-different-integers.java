class Solution {
    public int subarraysWithKDistinctUtil(int[] nums,int k){
        int n = nums.length;
        int ans = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;

        while(j < n){
            map.put(nums[j],map.getOrDefault(nums[j],0) + 1);

            while(map.size() > k){
                map.put(nums[i],map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }

            ans+=(j-i+1);
            j++;
        }

        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       
        return subarraysWithKDistinctUtil(nums,k) - subarraysWithKDistinctUtil(nums,k-1);
    }
}