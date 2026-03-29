class Solution {
    static String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
    //    ArrayList<String> ans = new ArrayList<>();
    //    ans.add("");
    //    for(int i = 0; i < digits.length(); i++){
    //         int val = digits.charAt(i) - '0';
    //         String str = map[val];
    //         ArrayList<String> curr = new ArrayList<>();

    //         for(int j = 0; j < str.length(); j++){
    //             char ch = str.charAt(j);
    //             for(String s : ans){
    //                 curr.add(s + ch);
    //             }
    //         }

    //         ans = curr;
    //    }

    //    return ans;

        // Through Recursion
        if(digits.length() == 0) {
            List<String> l = new ArrayList<>(Arrays.asList(""));
            return l;
        }
            List<String> smallAns = letterCombinations(digits.substring(1));
            List<String> myAns = new ArrayList<>();
            String str = map[digits.charAt(0) - '0'];

            for(int j = 0; j < str.length(); j++){
               for(String s : smallAns){
                    myAns.add(str.charAt(j) + s);
               }
            }

        return myAns;
    }
}