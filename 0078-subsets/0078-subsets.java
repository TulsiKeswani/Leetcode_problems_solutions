class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];

            List<List<Integer>> local = new ArrayList<>();
            local.addAll(ans);

            for(List<Integer> l : ans){
                List<Integer> new_list = new ArrayList<>(l);
                new_list.add(val);
                local.add(new_list);
            }

            ans = local;
        }

        return ans;
    }
}