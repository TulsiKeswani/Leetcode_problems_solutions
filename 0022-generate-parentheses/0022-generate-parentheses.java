class Solution {

    public List<String> generateParenthesisUtil(String s,int open,int close,List<String> ans){
        if(close < open) return ans;
        if(close == 0 && open == 0){
            ans.add(s);
            return ans;
        }
        if(open != 0) generateParenthesisUtil(s+"(",open-1,close,ans);
        return generateParenthesisUtil(s+")",open,close-1,ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesisUtil("(",n-1,n,ans);

        return ans;
    }
}