class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < sentences.length; i++){
            String word[] = sentences[i].split(" ");
            max = Math.max(word.length,max);
        }

        return max;
    }
}