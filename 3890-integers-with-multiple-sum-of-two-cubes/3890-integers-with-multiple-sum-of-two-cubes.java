class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            int left = (int)(Math.pow(i,3));
            if(left > n) break;
            for(int j = i; j <=n; j++){
                int cube = left + (int)(Math.pow(j,3));

                if(cube > n) break;
                map.put((cube),map.getOrDefault(cube,0)+1);

                if(map.get(cube) == 2) ans.add(cube);
            }
        }
        Collections.sort(ans);

        return ans;
    }
}