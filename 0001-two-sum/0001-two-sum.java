class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[] = new int[2];

        // Brute Force --> O(n^2)

        // for(int i = 0; i < nums.length-1; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             ans[0] = i;
        //             ans[1] = j;

        //             return ans;
        //         }
        //     }
        // }

        // optimal approach --> O(n)

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int y = target - nums[i];
            if(map.containsKey(y)){
                return new int[]{map.get(y),i};
            }

            map.put(nums[i],i);
        }
        
        return new int[2];
    }
}