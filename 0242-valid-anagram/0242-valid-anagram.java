class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        int hash[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 'a']++;
            hash[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < hash.length; i++){
            if(hash[i] != 0) return false;
        }

        return true;
    }
}