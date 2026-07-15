class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        // Brute force approach
        ArrayList<Integer> ans = new ArrayList<>();

        // for(int i = 0; i < nums.length; i++){
        //     boolean islonely = true;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i == j) continue;

        //         if(nums[i] == nums[j] || nums[j] == nums[i] + 1 || nums[j] == nums[i] - 1) {
        //             islonely = false;
        //             break;
        //         }   
        //     }

        //     if(islonely) ans.add(nums[i]);
        // }

        // return ans;

        HashMap<Integer,Integer> freq_track = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            freq_track.put(nums[i],freq_track.getOrDefault(nums[i],0) + 1);
        }

        for(Map.Entry<Integer,Integer> map : freq_track.entrySet()){
            if(map.getValue() == 1 && !freq_track.containsKey(map.getKey() -1) && !freq_track.containsKey(map.getKey() + 1)){
                ans.add(map.getKey());
            }
        }

        return ans;
    }
}