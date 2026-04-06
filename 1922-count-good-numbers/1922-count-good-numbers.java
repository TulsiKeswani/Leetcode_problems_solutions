class Solution {
    public int pow(int n,long x){
        if(x == 0) return 1;

        long halfPow = pow(n,x/2);
        long fullPow = halfPow * halfPow;
        fullPow = x % 2 == 0 ? fullPow : (fullPow * n);
        return (int)(fullPow % 1000000007);
    }
    public int countGoodNumbers(long n) {
        long even = (n+1) / 2;
        long odd = n - even;
        
        long evenProd = pow(5,even);
        long oddProd = pow(4,odd);
        int ans = (int)((evenProd * oddProd) % 1000000007);
       return ans ;
    }
}