class Solution {
    String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
       ArrayList<String> ans = new ArrayList<>();
       ans.add("");
       for(int i = 0; i < digits.length(); i++){
            int val = digits.charAt(i) - '0';
            String str = map[val];
            ArrayList<String> curr = new ArrayList<>();

            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                for(String s : ans){
                    curr.add(s + ch);
                }
            }

            ans = curr;
       }

       return ans;
    }
}