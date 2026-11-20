class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int n = s1.length();
        int m = s2.length();
        int i = 0;
        int j = 0;

        for(i = 0; i < n; i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0) + 1);
        }

        i=0;

        while(j < s2.length()){
            char ch = s2.charAt(j);
            map2.put(s2.charAt(j),map2.getOrDefault(ch,0) + 1);

            if((j - i + 1) == n){
                if(map1.equals(map2)){
                    return true;
                }
                char ch2 = s2.charAt(i);
                map2.put(ch2,map2.get(ch2) - 1);

                if(map2.get(ch2) == 0){
                    map2.remove(ch2);
                }

                i++;
            }

            j++;
        }
        return false;
    }
}