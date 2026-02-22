class Solution {
    public int scoreDifference(int[] nums) {
        int score1 = 0;
        int score2 = 0;
        boolean turn1 = true;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 1){
                turn1 = !turn1;
            }
            if((i + 1) % 6 == 0){
                turn1 = !turn1;
            }
            if(turn1){
                score1+=nums[i];
            }
            else{
                score2+=nums[i];
            }
        }

        return score1 - score2;
    }
}