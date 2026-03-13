class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int rn = 0;
        int temp = x;
        while(temp != 0){
            int ld = temp % 10;
            rn = rn * 10 + ld;
            temp/=10;
        }
        return rn == x;
    }
}