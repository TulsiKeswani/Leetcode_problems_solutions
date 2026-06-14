class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> occu = new ArrayList<>();
        int ans[] = new int[queries.length];

        for(int i = 0; i < nums.length; i++){
            if(x == nums[i]){
                occu.add(i);
            }
        }

        for(int i = 0; i < queries.length; i++){
            if(queries[i] > occu.size()){
                ans[i] = -1;
            }
            else{
                ans[i] = occu.get(queries[i]-1);
            }
        }

        return ans;
    }
}