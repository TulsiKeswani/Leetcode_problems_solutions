class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int rsum = 0;
        int lsum = 0;
        int n = cardPoints.length;
        for(int i = 0; i < k; i++){
            rsum+=cardPoints[i];
        }
   
        int maxSum = rsum;
        for(int i = n-1,j = k-1; i > n-k-1 && j >= 0; i--,j--){
            lsum+=cardPoints[i];
            rsum-=cardPoints[j];
            maxSum = Math.max(maxSum,lsum+rsum);
        }

        return maxSum;
    }
}