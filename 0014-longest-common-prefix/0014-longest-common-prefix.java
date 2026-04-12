class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        Arrays.sort(strs);
        int n = strs.length-1;
        int i = 0;
        StringBuilder sb = new StringBuilder("");
        while(i < strs[0].length() && i < strs[n].length()){
            if(strs[0].charAt(i) != strs[n].charAt(i)) break;
            sb.append(strs[0].charAt(i));
            i++;
        }

        return sb.toString();
    }
}