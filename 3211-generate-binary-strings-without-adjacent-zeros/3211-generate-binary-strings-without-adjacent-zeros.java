class Solution {
    public List<String> validStringsUtil(String curr, int n,List<String> l){
        if(n == 0){
            l.add(curr);
            return l;
        }

        if(curr.charAt(curr.length() - 1) != '0')
            validStringsUtil(curr + "0",n-1,l);

        validStringsUtil(curr + "1",n-1,l);

        return l;
    }
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
        // List<String> ans = new ArrayList<>();
        // ans.add("");
        // for(int i = 1; i <= n; i++){
        //     List<String> temp = new ArrayList<>();
        //     for(String s : ans){
        //         if(s.length() == 0 || s.charAt(0) != '0'){
        //             temp.add(0 + s);
        //         }
        //         temp.add(1+s);
        //     }
        //     ans = temp;
        // }

        // return ans;

        // bottom up recursion
        List<String> ans = new ArrayList<>();
        validStringsUtil("1",n-1,ans);
        validStringsUtil("0",n-1,ans);

        return ans;

    }
}