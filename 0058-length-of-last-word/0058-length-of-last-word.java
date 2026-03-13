class Solution {
    public int lengthOfLastWord(String s) {
        // String arr[] = s.split(" ");

        // return arr[arr.length-1].length();
        s = s.trim();
        int n = s.length();
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == ' '){
                return n-i-1;
            }
        }

        return n;
    }
}