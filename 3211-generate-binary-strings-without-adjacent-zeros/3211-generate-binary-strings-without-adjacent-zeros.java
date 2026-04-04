class Solution {
    public List<String> validStrings(int n) {
        if(n == 0) return new ArrayList<>(Arrays.asList(""));

        List<String> smallAns = validStrings(n-1);
        List<String> currAns = new ArrayList<>();

        for(String s : smallAns){ 
            if(s.length() == 0 || s.charAt(0) != '0'){
                currAns.add(0 + s);
            }

            currAns.add(1 + s);
        }

        return currAns;
    }
}