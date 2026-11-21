class Solution {
    class Pair implements Comparable<Pair> {
        int val;
        int idx;

        Pair(int val, int i) {
            this.val = val;
            this.idx = i;
        }

        @Override
        public int compareTo(Pair p) {
            return Integer.compare(this.val, p.val);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        
        Pair arr[] = new Pair[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = new Pair(nums[i],i);
        }

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length-1;

        while(i < j){
            int sum = arr[i].val + arr[j].val;

            if(sum == target){
                return new int[]{arr[i].idx,arr[j].idx};
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }

        return new int[]{-1,-1};
    }
}