class Solution {
    public int characterReplacement(String s, int k) {
        
        int i = 0;
        int j = 0;
        int maxfreq = 0;
        int freq[] = new int[26];
        int count = 0;
        int maxLength = 0;
        while(j < s.length()){
            int ch = s.charAt(j) - 'A';
            count++;

            freq[ch]++;
            if(freq[ch] > maxfreq){
                maxfreq = freq[ch];
            }

            int flips = count - maxfreq;

            if(flips > k){
                freq[s.charAt(i) - 'A']--;
                count--;
                int max = 0;
                for(int l = 0; l < freq.length; l++){
                    max = Math.max(max,freq[l]);
                }
                maxfreq = max;
                i++;
            }
            else{
                maxLength = Math.max(maxLength,j-i+1);
            }
            j++;
        }

        return maxLength;
    }
}