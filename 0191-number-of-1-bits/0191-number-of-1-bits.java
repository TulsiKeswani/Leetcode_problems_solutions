class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n != 0){
            int rem = n % 2;
            ans += rem;
            n /= 2;
        }

        return ans;
    }
}