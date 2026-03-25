class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n-1);
        int count = 1;
        StringBuilder ans = new StringBuilder();

        for(int i = 1; i < s.length(); i++){
            char ch = s.charAt(i);
            char prev = s.charAt(i-1);
            if(ch != prev){
                ans.append(count+""+prev);
                count = 0;
            }
            count++;
        }

        ans.append(count +""+ s.charAt(s.length() - 1));
        return ans.toString();
    }
}