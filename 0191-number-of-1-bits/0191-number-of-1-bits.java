class Solution {
    public int hammingWeight(int n) {
        // int ans = 0;
        // while(n != 0){
        //     int rem = n % 2;
        //     ans += rem;
        //     n /= 2;
        // }

        // return ans;


        //  Approach 2
        int count = 0;
        while(n != 0){
            count +=  n & 1;
            n = n >> 1;
        }

        return count;
    }
}