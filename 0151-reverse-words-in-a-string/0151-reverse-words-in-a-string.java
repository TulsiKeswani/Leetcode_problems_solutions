class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int n = s.length()-1;
        int j = n;
        int i = n;
        while(i >= 0) {
            if(s.charAt(i) == ' '){
                ans.append(s.substring(i+1,j+1) + " ");
                while(s.charAt(i) == ' '){
                    i--;
                }
                j = i;
            }
            else i--;
        }
        ans.append(s.substring(i+1,j+1));
        return ans.toString();
    }
}