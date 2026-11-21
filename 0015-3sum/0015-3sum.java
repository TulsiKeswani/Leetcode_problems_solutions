class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // Brute Force
        // HashSet<List<Integer>> m = new HashSet<>();

        // for(int i = 0; i < nums.length-2; i++){
        //     for(int j = i + 1; j < nums.length-1; j++){
        //         for(int k = j + 1; k < nums.length;k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List l = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
        //                 Collections.sort(l);
        //                 m.add(new ArrayList(l));
        //             }
        //         }
        //     }
        // }

        // return new ArrayList(m);
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    ans.add(new ArrayList(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    k--;

                    while(j < nums.length && nums[j] == nums[j-1]) j++;
                    while(k >= 0 && nums[k] == nums[k+1]) k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }

        return ans;
    }
}