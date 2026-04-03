class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        byte isneg = 1;
        s = s.trim();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(i == 0 && ch == '-'){
                isneg = -1;
                continue;
            }
            
            if(i == 0 && ch == '+') continue;

            if(ans == 0 && ch == '0') continue;

            if(ch < '0' || ch > '9') break;

            ans = ans * 10 + (ch - '0');
            long curr = ans * isneg;
            if(curr >= Integer.MAX_VALUE || curr <= Integer.MIN_VALUE){
                return isneg < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
       
        return (int)(ans * isneg);
    }
}