class Solution {
    public String maximumXor(String s, String t) {
        int xor = 0;
        int zeroes = 0;
        int ones = 0;
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if((ch - '0') == 0){
                zeroes++;
            }
            else{
                ones++;
            }
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '1'){
                if(zeroes != 0){
                    ans.append('1');
                    zeroes--;
                } 
                else{
                    ans.append('0');
                    ones--;
                }
            }
            else{
               if(ones != 0){
                    ans.append('1');
                    ones--;
                } 
                else{
                    ans.append('0');
                    zeroes--;
                }
            }
        }
        return ans.toString();
    }
}