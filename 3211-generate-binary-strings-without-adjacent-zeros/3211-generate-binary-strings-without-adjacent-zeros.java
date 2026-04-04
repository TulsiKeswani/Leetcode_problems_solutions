class Solution {
    public List<String> validStrings(int n) {
        // Using Recursion

        // if(n == 0) return new ArrayList<>(Arrays.asList(""));

        // List<String> smallAns = validStrings(n-1);
        // List<String> currAns = new ArrayList<>();

        // for(String s : smallAns){ 
        //     if(s.length() == 0 || s.charAt(0) != '0'){
        //         currAns.add(0 + s);
        //     }

        //     currAns.add(1 + s);
        // }

        // return currAns;

        // Using Loops
        List<String> ans = new ArrayList<>();
        ans.add("");
        for(int i = 1; i <= n; i++){
            List<String> temp = new ArrayList<>();
            for(String s : ans){
                if(s.length() == 0 || s.charAt(0) != '0'){
                    temp.add(0 + s);
                }
                temp.add(1+s);
            }
            ans = temp;
        }

        return ans;
    }
}