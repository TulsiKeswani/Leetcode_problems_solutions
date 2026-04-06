class Solution {
    public void getSubsets(int[] nums,int i, List<List<Integer>> l){
        if(i == 0){
            l.add(new ArrayList<>());
            return;
        }

        getSubsets(nums,i-1,l);
        List<List<Integer>> myAns = new ArrayList<>();
        for(List<Integer> list : l){
            myAns.add(new ArrayList<>(list));
            myAns.get(myAns.size()-1).add(nums[i-1]);
        }
        l.addAll(myAns);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        getSubsets(nums,n,ans);
        return ans;
    }
}