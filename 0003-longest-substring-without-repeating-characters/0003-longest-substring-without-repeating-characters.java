class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxL = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(j < s.length()){
            char ch = s.charAt(j);

            if(map.containsKey(ch) && map.get(ch) >= i){
                i = map.get(ch) + 1;
            }
            else{
                int len = j - i + 1;
                maxL = Math.max(maxL,len);
            }
            map.put(ch,j);
            j++;
        }

        return maxL;
    }
}