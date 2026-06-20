class Solution {
    static String digit_map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        // Approach 1 -> With recursion
        // base case

        if(digits.length() == 0){
            return new ArrayList<>(Arrays.asList(""));
        }
        List<String> smallAns = letterCombinations(digits.substring(1));
        List<String> myAns = new ArrayList<>();

        String curr = digit_map[digits.charAt(0) - '0'];

        for(int i = 0; i < curr.length(); i++){

            for(String s : smallAns){
                myAns.add(curr.charAt(i) + s);
            }
        }

        return myAns;
        // Approach 2 -> Without recursion;

        // List<String> ans = new ArrayList<>();
        // ans.add("");
        // for(int i = 0; i < digits.length(); i++){
        //     List<String> curr = new ArrayList<>();

        //     int dig = digits.charAt(i) - '0';

        //     for(int j = 0; j < digit_map[dig].length(); j++){

        //         for(String s : ans){
        //             curr.add(s + digit_map[dig].charAt(j));
        //         }
        //     }

        //     ans = curr;
        // }

        // return ans;
    }
}