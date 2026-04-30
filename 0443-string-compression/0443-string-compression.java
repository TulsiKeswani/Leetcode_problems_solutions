class Solution {
   
    public int compress(char[] chars) {
        char prev = chars[0];
        int count = 1;
        int k = -1;

        for(int i = 1; i < chars.length; i++){
            char ch = chars[i];
            if(ch == prev){
                count++;
            }
            else{
                k++;
                chars[k] = prev;
                String s = count + "";

                for(int j = 0; j < s.length() && count != 1; j++){
                    k++;
                    chars[k] = s.charAt(j);
                }
                prev = ch;
                count = 1;
            }
        }

        k++;
        chars[k] = prev;
        String s = count + "";

        for(int j = 0; j < s.length() && count != 1; j++){
            k++;
            chars[k] = s.charAt(j);
        }

        return k+1;
    }
}