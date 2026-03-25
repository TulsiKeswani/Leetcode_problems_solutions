class Solution {
    public String countAndSay(int n) {
        // Recursion Approach
        // if(n == 1) return "1";
        // String s = countAndSay(n-1);
        // int count = 1;
        // StringBuilder ans = new StringBuilder();

        // for(int i = 1; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     char prev = s.charAt(i-1);
        //     if(ch != prev){
        //         ans.append(count+""+prev);
        //         count = 0;
        //     }
        //     count++;
        // }

        // ans.append(count +""+ s.charAt(s.length() - 1));
        // return ans.toString();

        // Dp Approach

        String dp[] = new String[n];
        dp[0] = "1";

        for(int i = 1; i < n; i++){
            String s = dp[i-1];
            int count = 1;
            int m = s.length();
            StringBuilder curr = new StringBuilder();

            for(int j = 1; j < m; j++){
                char ch = s.charAt(j);
                char prev = s.charAt(j-1);

                if(ch != prev){
                    curr.append(count+""+prev);
                    count = 0;
                }
                count++;
            }
            curr.append(count+""+s.charAt(m-1));
            dp[i] = curr.toString();
        }
        return dp[n-1];
    }
}