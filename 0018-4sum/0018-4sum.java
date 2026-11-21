class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // HashSet<List<Integer>> ans = new HashSet<>();

        // for(int i = 0; i < nums.length-3; i++){
        //     for(int j = i+1; j < nums.length-2; j++){
        //         for(int k = j+1; k < nums.length-1; k++){
        //             for(int l = k+1; l < nums.length; l++){
        //                 if((nums[i] * 1L + nums[j] + nums[k] + nums[l]) == target){
        //                     List<Integer> list = new ArrayList(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

        //                     Collections.sort(list);
        //                     ans.add(list);
        //                 }
        //             }
        //         }
        //     }
        // }

        // return new ArrayList(ans);


        // HashSet<List<Integer>> ans = new HashSet<>();

        // for(int i = 0; i < nums.length-3; i++){
        //     for(int j = i+1; j < nums.length-2; j++){
        //         HashSet<Long> s = new HashSet<>();

        //         for(int k = j+1; k < nums.length; k++){
        //             long l = target - (nums[i] + nums[j] + nums[k] * 1L);
        //             if(s.contains(l)){
        //                 ArrayList<Integer> list = new ArrayList(Arrays.asList(
        //                     nums[i],
        //                     nums[j],
        //                     nums[k],
        //                     (int)l
        //                 ));

        //                 Collections.sort(list);

        //                 ans.add(list);
        //             }

        //             s.add(nums[k] * 1L);
        //         }
        //     }
        // }

        // return new ArrayList(ans);


        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length - 2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;

                while(k < l){
                    long sum = nums[i] + nums[k] * 1L;
                    sum+=(nums[j] * 1L + nums[l]);
                    if(sum == target){
                        ans.add(new ArrayList(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[k],
                            nums[l]
                        )));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(l > k && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}