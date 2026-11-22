class Solution {
    public int subarraySum(int[] nums, int target) {
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum+=nums[j];

        //         if(sum == target) count++;
        //     }
        // }

        // return count;

        HashMap<Integer,Integer> storeSum = new HashMap<>();
        int sum = 0;
        storeSum.put(0,1);
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];

            if(storeSum.containsKey(sum - target)){
                count+=storeSum.get(sum-target);
            }

            storeSum.put(sum,storeSum.getOrDefault(sum,0) + 1);
        }

        return count;
    }
}