class Solution {
    public List<List<Integer>> subsetsWithDupUtil(int[] nums,int idx){
        if(idx == nums.length){
            List<List<Integer>> l= new ArrayList<>();
            l.add(new ArrayList<>());
            return l;
        }

        List<List<Integer>> smallAns = subsetsWithDupUtil(nums,idx+1);

        List<List<Integer>> myAns = new ArrayList<>();


        for(List<Integer> l: smallAns){
            myAns.add(l);
            List<Integer> curr = new ArrayList<>(l);
            curr.add(nums[idx]);
            myAns.add(curr);
        }

        return myAns;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
       List<List<Integer>> ansWithDuplicates = subsetsWithDupUtil(nums,0);
    
        HashSet<List<Integer>> ansWithoutDuplicates = new HashSet<>();

        for(List<Integer> l : ansWithDuplicates){
            Collections.sort(l);
            ansWithoutDuplicates.add(l);
        }

        return new ArrayList<>(ansWithoutDuplicates);
    }
}