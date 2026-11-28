class Solution {
    // public int lengthOfLISUtil()
    public int lengthOfLIS(int[] nums) {

        // return Math.min(lengthOfLIS(0,))
        // List<List<Integer>> track = new ArrayList<>();
        // int maxLen = 0;
        // track.add(new ArrayList());
        // for(int i = 0; i < nums.length; i++){
        //      List<List<Integer>> myAns = new ArrayList<>();
        //     for(List<Integer> l : track){
        //         if(l.isEmpty() || (l.get(l.size() - 1) < nums[i])){
        //             List<Integer> newList = new ArrayList(l);
        //             newList.add(nums[i]);
        //             myAns.add(newList);
        //             maxLen = Math.max(maxLen,newList.size());
        //         }
        //     }

        //     for(List<Integer> l : myAns){
        //         track.add(l);
        //     }
        // }

        // return maxLen;

        int dp[] = new int[nums.length]; 
        Arrays.fill(dp,1);
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            for(int j = i-1; j >= 0; j--){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);

                    max = Math.max(max,dp[i]);
                }
            }
        }
        return max;
    }
}