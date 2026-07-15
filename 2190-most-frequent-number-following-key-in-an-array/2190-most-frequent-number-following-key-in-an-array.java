class Solution {
    public int mostFrequent(int[] nums, int key) {
        
        // Brute force Approach 

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == key){
                freq.put(nums[i+1],freq.getOrDefault(nums[i+1],0) + 1);
            }
        }
        int ele = -1;
        int f = -1;
        for(Map.Entry<Integer,Integer> map : freq.entrySet()){
            if(map.getValue() > f){
                ele = map.getKey();
                f = map.getValue();
            }
        }

        return ele;
    }
}