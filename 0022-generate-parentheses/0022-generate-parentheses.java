class Solution {

    public List<String> generateParenthesisUtil(StringBuilder s,int open,int close,List<String> ans){
        if(close == 0 && open == 0){
            ans.add(s.toString());
            return ans;
        }
        if(open != 0) {
            generateParenthesisUtil(s.append("("),open-1,close,ans);
            s.deleteCharAt(s.length()-1);
        }
        if(close != open){
            generateParenthesisUtil(s.append(")"),open,close-1,ans);
            s.deleteCharAt(s.length()-1);
        }
        return ans;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesisUtil(new StringBuilder(""),n,n,ans);

        return ans;
    }
}