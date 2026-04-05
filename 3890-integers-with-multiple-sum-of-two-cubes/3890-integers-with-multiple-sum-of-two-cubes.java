class Solution {
    static List<Integer> goodIntegers = new ArrayList<>();

    static {
        int max = (int)Math.pow(10,3);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 1; i <= max ; i++){
            int left = i*i*i;
            
            for(int j = i; j <=max; j++){
                int cube = left + j*j*j;

                if(cube > Math.pow(10,9)) break;
                map.put((cube),map.getOrDefault(cube,0)+1);

                if(map.get(cube) == 2) goodIntegers.add(cube);
            }
        }
        Collections.sort(goodIntegers);
    }
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> ans = new ArrayList<>();

        for(int val : goodIntegers){
            if(val > n) break;
            ans.add(val);
        }
        return ans;
    }
}