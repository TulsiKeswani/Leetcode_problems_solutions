class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        for(int i = 0; i < t.length(); i++){
            sum -= (i < s.length() ? (int)s.charAt(i) : 0);
            sum +=t.charAt(i);
        }
        return (char)sum;
    }
}