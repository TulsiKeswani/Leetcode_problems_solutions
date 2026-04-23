class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        // Approach 1

        // List<Integer> ans = new ArrayList<>();
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i = 0; i < nums.length; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0) + 1);

        //     if(map.get(nums[i]) == 2){
        //         ans.add(nums[i]);
        //     }
        // }

        // return ans;

        // Approach 2
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1;

            if(nums[idx] < 0){
                ans.add(idx+1);
            }
            else{
                nums[idx] = -nums[idx];
            }
        }

        return ans;
    }
}