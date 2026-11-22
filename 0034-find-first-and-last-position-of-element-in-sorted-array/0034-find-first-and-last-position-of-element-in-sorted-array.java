class Solution {
    public int[] searchRange(int[] nums, int target) {
        int stidx = -1;
        int endidx = -1;

        // calcualte first Occurence 

        int i = 0;
        int j = nums.length-1;

        while(i <= j){
            int mid = i + (j-i) / 2;

            if(nums[mid] >= target){
                if(nums[mid] == target) stidx = mid;
                j = mid-1;
            }
            else {
                i = mid + 1;
            }
        }

        System.out.println(stidx);
        // calculate Last Occurence
        i = 0;
        j = nums.length-1;

        while(i <= j){
            int mid = i + (j-i) / 2;

            if(nums[mid] <= target){
                if(nums[mid] == target) endidx = mid;
                i=mid+1;
            }
            else {
                j = mid-1;
            }
         }

         return new int[]{stidx,endidx};
    }
}