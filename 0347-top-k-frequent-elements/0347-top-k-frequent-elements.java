class Pair{
    int val;
    int freq;

    Pair(int val,int freq){
        this.val = val;
        this.freq = freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b) -> a.freq - b.freq);

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            q.add(new Pair(entry.getKey(),entry.getValue()));

            if(q.size() > k) q.remove();
        }


        int ans[] = new int[k];
        int i = 0;
        while(!q.isEmpty()){
            ans[i] = q.remove().val;
            i++;
        }

        return ans;
    }
}