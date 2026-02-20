class Solution {
    public int longestOnes(int[] nums, int k) {
    //     int maxLen = 0;
    //    for(int i = 0; i < nums.length; i++){
    //         int count = 0;

    //         for(int j = i; j < nums.length; j++){
    //             if(nums[j] == 1 || count < k){
    //                 maxLen = Math.max(maxLen,j - i + 1);
    //             }
    //             else{
    //                 break;
    //             }

    //             if(nums[j] == 0){
    //                 count++;
    //             }
    //         }
    //    }

    //    return maxLen;

        int i = 0;
        int j = 0;
        int maxL = 0;
        Queue<Integer> q = new LinkedList<>();

        while(j < nums.length){
            if(nums[j] == 0){
                q.add(j);
            }

            if(nums[j] == 1 || q.size() <= k){
                maxL = Math.max(maxL,j - i + 1);
            }
            else{
                i = q.remove() + 1;
            }

            j++;
        }

        return maxL;
    }
}