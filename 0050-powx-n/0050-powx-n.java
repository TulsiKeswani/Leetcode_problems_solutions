class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        double halfPow = myPow(x,Math.abs(n/2));
        double fullPow = halfPow * halfPow;
        fullPow = n % 2 == 0 ? fullPow : fullPow * x;

        return n < 0 ? (1 / fullPow) : fullPow;
    }
}