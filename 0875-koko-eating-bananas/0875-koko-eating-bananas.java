class Solution {
    public boolean isPossible(int arr[],int k,int h){
        int req = 0;
        for(int i = 0; i < arr.length; i++){
            req += Math.ceil((arr[i] * 1.0) / k);
        }

        return req <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max,piles[i]);
        }

        while(min <= max){
            int mid = min + (max - min) /2;

            if(isPossible(piles,mid,h)){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid + 1;
            }
        }

        return ans;
    }
}