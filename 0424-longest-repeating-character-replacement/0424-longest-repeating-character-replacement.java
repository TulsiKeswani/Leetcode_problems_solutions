class Solution {
    public int characterReplacement(String s, int k) {
        // brute force
        int n = s.length();
        int freq[] = new int[26];
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < n){
            char c = s.charAt(j);
            freq[c - 'A']++;
            int maxOccu = 0;
            int count = 0;
            for(int l = 0; l < freq.length; l++){
                maxOccu = Math.max(maxOccu,freq[l]);
                count+=freq[l];
            }
            int changeCount = (count - maxOccu);
            if(changeCount <= k){
                ans = Math.max(ans,j-i+1);
            }
            else{
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            j++;
        }
        return ans;
    }
}