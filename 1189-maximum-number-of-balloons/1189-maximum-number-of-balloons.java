class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int freq[] = new int[5];
        String s = "balon";
        for(int i = 0; i < text.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == text.charAt(i)){
                    freq[j]++;
                }
            }
        }

        freq[2] /= 2;
        freq[3] /= 2;
        int min = freq[0];
        for(int f : freq){
            min = Math.min(min,f);
        }

        return min;
    }
}