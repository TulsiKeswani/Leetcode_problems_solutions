class Solution {
    public boolean checkGoodInteger(int n) {
        int digSum = 0;
        int squareSum = 0;

        while(n != 0){
            int ld = n % 10;
            digSum += ld;
            squareSum+=(ld * ld);

            n /= 10;
        }

        return squareSum - digSum >= 50;
    }
}