class Solution {
    public int largestAltitude(int[] gain) {
        int g = 0;
        int maxGain = 0;

        for(int i = 0; i < gain.length; i++){
            g+=gain[i];
            maxGain = Math.max(maxGain,g);
        }

        return maxGain;
    }
}