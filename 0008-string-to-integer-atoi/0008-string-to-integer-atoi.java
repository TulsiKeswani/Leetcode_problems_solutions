class Solution {
    public int myAtoiUtil(String s,int ans,boolean isneg){
        if(s.length() == 0 || (s.charAt(0) < '0' || s.charAt(0) > '9')) return isneg ? -ans : ans;

        char ch = s.charAt(0);
        int val = (ch - '0');
        long curr = (long)ans * 10 + val;
        if(isneg && (curr > Integer.MAX_VALUE)) return Integer.MIN_VALUE;
        if(!isneg && (curr >= Integer.MAX_VALUE)) return Integer.MAX_VALUE;

        return myAtoiUtil(s.substring(1),(int) curr,isneg);
    }
    public int myAtoi(String s) {
        // Recursive Approach
        s = s.strip();
        if(s.length() == 0) return 0;
        int i = 0;
        boolean isneg = false;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            isneg = s.charAt(0) == '-';
            i++;
        }
        System.out.println(isneg);
        return myAtoiUtil(s.substring(i),0,isneg);
    }
    // public int myAtoi(String s) {
    //     // long ans = 0;
    //     // byte isneg = 1;
    //     // s = s.trim();
    //     // for(int i = 0; i < s.length(); i++){
    //     //     char ch = s.charAt(i);
    //     //     if(i == 0 && ch == '-'){
    //     //         isneg = -1;
    //     //         continue;
    //     //     }
            
    //     //     if(i == 0 && ch == '+') continue;

    //     //     if(ans == 0 && ch == '0') continue;

    //     //     if(ch < '0' || ch > '9') break;

    //     //     ans = ans * 10 + (ch - '0');
    //     //     long curr = ans * isneg;
    //     //     if(curr >= Integer.MAX_VALUE || curr <= Integer.MIN_VALUE){
    //     //         return isneg < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    //     //     }
    //     // }
       
    //     // return (int)(ans * isneg);

    //     // More cleaner way

    //     // s = s.trim();
    //     // if(s.length() == 0) return 0;
    //     // int i = 0;
    //     // boolean isneg = false;
    //     // if(s.charAt(i) == '-' || s.charAt(i) ==  '+'){
    //     //     isneg = s.charAt(i) == '-';
    //     //     i++;
    //     // }
    //     // long ans = 0;
    //     // while(i < s.length()){
    //     //     char ch = s.charAt(i);

    //     //     if(ch < '0' || ch > '9') break;

    //     //     ans = ans * 10 + (ch - '0');
    //     //     if(isneg && (ans > Integer.MAX_VALUE)){
    //     //         return Integer.MIN_VALUE;
    //     //     }
    //     //     if(!isneg && (ans >= Integer.MAX_VALUE)){
    //     //         return Integer.MAX_VALUE;
    //     //     }
    //     //     i++;
    //     // }
    //     // int finalAns = (int)ans;
    //     // return isneg ? -finalAns : finalAns;

    // }
}