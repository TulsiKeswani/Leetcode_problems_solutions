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
        // Arrays.sort(nums);
        // List<List<Integer>> ans = new ArrayList<>();
        // for(int i = 0; i < nums.length-2; i++){
        //     if(i != 0 && nums[i] == nums[i-1]) continue;

        //     int j = i+1;
        //     int k = nums.length-1;

        //     while(j < k){
        //         int sum = nums[i] + nums[j] + nums[k];

        //         if(sum == 0){
        //             ans.add(new ArrayList(Arrays.asList(nums[i],nums[j],nums[k])));
        //             j++;
        //             k--;

        //             while(j < nums.length && nums[j] == nums[j-1]) j++;
        //             while(k >= 0 && nums[k] == nums[k+1]) k--;
        //         }
        //         else if(sum < 0){
        //             j++;
        //         }
        //         else{
        //             k--;
        //         }
        //     }
        // }

        // return ans;

        // HashSet<List<Integer>> ans = new HashSet<>();
        // for(int i = 0; i < nums.length-2; i++){
        //     HashSet<Integer> set = new HashSet<>();

        //     for(int j = i+1; j < nums.length; j++){
        //             int k = (nums[i] + nums[j]) * -1;

        //             if(set.contains(k)){
        //                 ArrayList<Integer> l = new ArrayList(Arrays.asList(nums[i],nums[j],k));
        //                 Collections.sort(l);
        //                 ans.add(l);
        //                 set.remove(k);
        //             }
        //             else{
        //                 set.add(nums[j]);
        //             }
        //     }
        // }

        // return new ArrayList(ans);

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){

            if(i != 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(k > j && nums[k] == nums[k+1]) k--;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }

        return ans;
    }
}