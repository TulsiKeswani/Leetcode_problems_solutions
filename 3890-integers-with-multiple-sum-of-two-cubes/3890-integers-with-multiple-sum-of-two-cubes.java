class Solution {
    public List<Integer> findGoodIntegers(int n) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            int left = (int)(Math.pow(i,3));
            if(left > n) break;
            for(int j = i; j <=n; j++){
                int cube = left + (int)(Math.pow(j,3));

                if(cube > n) break;
                map.put((cube),map.getOrDefault(cube,0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() >= 2) ans.add(e.getKey());
        }

        return ans;
    }
}