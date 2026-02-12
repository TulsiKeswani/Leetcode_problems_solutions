class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxl= Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            HashMap<Character,Integer> map = new HashMap<>();
            // int arr[] = new int[26];

            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch,0) + 1);
                HashSet<Integer> set = new HashSet<>();
                boolean isBalanced = true;
                for(int val : map.values()){
                    set.add(val);

                    if(set.size() > 1) {
                        isBalanced = false;
                        break;
                    }
                }

                if(isBalanced){
                    maxl = Math.max(maxl,j - i + 1);
                }
            }
        }

        return maxl;
    }
}