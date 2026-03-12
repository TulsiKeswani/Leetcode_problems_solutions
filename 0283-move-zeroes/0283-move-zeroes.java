class Solution {
    public void moveZeroes(int[] nums) {
        // ArrayList<Integer> list = new ArrayList<>();

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != 0){
        //         list.add(nums[i]);
        //     }  
        // }

        // int i = 0;

        // for (int val : list) {
        //     nums[i]=val;
        //     i++;
        // }

        // while(i < nums.length){
        //     nums[i] = 0;
        //     i++;
        // }

        // int i = 0;
        // int j = 0;

        // while(j < nums.length){
        //     if(nums[j] == 0){
        //         j++;
        //     }
        //     else{
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         i++;
        //         j++;
        //     }
        // }
        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }

            j++;
        }
    }
}