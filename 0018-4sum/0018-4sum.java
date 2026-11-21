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


        HashSet<List<Integer>> ans = new HashSet<>();

        for(int i = 0; i < nums.length-3; i++){
            for(int j = i+1; j < nums.length-2; j++){
                HashSet<Long> s = new HashSet<>();

                for(int k = j+1; k < nums.length; k++){
                    long l = target - (nums[i] + nums[j] + nums[k] * 1L);
                    if(s.contains(l)){
                        ArrayList<Integer> list = new ArrayList(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[k],
                            (int)l
                        ));

                        Collections.sort(list);

                        ans.add(list);
                    }

                    s.add(nums[k] * 1L);
                }
            }
        }

        return new ArrayList(ans);

    }
}