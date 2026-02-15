class Solution {
    public int mySqrt(int x) {
        if(x == 1 || x == 0) return x;
        int st = 1;
        int end = x / 2;

        while(st <= end){
            int mid = st + (end - st) / 2;
            long sq = mid * 1L * mid;
            if(sq == x){
                return mid;
            }
            else if(sq < x){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return end;
    }
}