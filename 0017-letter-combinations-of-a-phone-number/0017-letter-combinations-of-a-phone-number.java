class Solution {
    static String digit_map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        ans.add("");
        for(int i = 0; i < digits.length(); i++){
            List<String> curr = new ArrayList<>();

            int dig = digits.charAt(i) - '0';

            for(int j = 0; j < digit_map[dig].length(); j++){

                for(String s : ans){
                    curr.add(s + digit_map[dig].charAt(j));
                }
            }

            ans = curr;
        }

        return ans;
    }
}