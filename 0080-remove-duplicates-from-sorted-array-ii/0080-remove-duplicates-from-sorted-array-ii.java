class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int count = 1;
        int lastSeen = nums[0];
        for(int j = 1; j < nums.length; j++){
            if(i == 0 || nums[j] != nums[i-1]){
                i++;
                nums[i] = nums[j];
                count++;
            }
        }
        return count;
    }
}