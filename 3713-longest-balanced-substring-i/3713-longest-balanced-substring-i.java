class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxl= Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            HashSet<Character> set = new HashSet<>();
            int arr[] = new int[26];

            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                set.add(ch);
                arr[ch - 'a']++;

                int check = arr[ch - 'a'];
                boolean isBalanced = true;
                for(char c : set){
                    if(arr[c - 'a'] != check){
                        isBalanced = false;
                        break;
                    }
                }

                if(isBalanced){
                    maxl = Math.max(maxl,j - i + 1);
                }
            }
        }

        return maxl;
    }
}