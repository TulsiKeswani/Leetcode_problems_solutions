class Solution {
    public int singleNonDuplicate(int[] nums) {
        // // solution 1 --> Brute force (linear traversal)
        // for(int i = 0; i < nums.length; i+=2){
        //     if(i == nums.length-1 || nums[i] != nums[i+1]) return nums[i];
        // }

        // return nums[0];

        // // solution 2 --> xor operator
        // int xor = 0;
        // for(int i = 0; i < nums.length; i++){
        //     xor ^= nums[i];
        // }

        // return xor;

        // Binary search

        int st = 0;
        int n = nums.length;
        int end = n-1;

        while(st <= end){
            int mid = st + (end - st) / 2;

            if(st == end || (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])){
                return nums[mid];
            }
            else if(nums[mid] == nums[mid+1]){
               if((end - mid + 1) % 2 != 0){
                   st = mid+2;
               }
               else{
                    end = mid-1;
               }
            }
            else{
                if((mid - st + 1) % 2 != 0){
                   end = mid-2;
               }
               else{
                    st = mid+1;
               }
            }
        }

        return -1;
    }
}