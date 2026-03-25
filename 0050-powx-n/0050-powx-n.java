class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        double pow = myPow(x, Math.abs(n / 2));
        double ans = n % 2 == 0? pow * pow : x * pow * pow;
        
        return n < 0 ? 1 / ans : ans;
    }
}