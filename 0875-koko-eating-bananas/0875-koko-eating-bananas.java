class Solution {
    public boolean canEat(int arr[],int k,int h){
        int time = 0;
        for(int i = 0; i < arr.length; i++){
            double div = arr[i] * 1.0 / k;
            time+=Math.ceil(div);
        }
        return !(time > h);
    }
    public int minEatingSpeed(int[] piles, int h) {
            int min = 1;
            int max = Integer.MIN_VALUE;
            int ans = max;
            for(int i = 0;i < piles.length; i++){
                max = Math.max(max,piles[i]);
            }
            while(min <= max){
                int mid = min + (max - min) / 2;
                if(canEat(piles,mid,h)){
                    ans = mid;
                    max = mid-1;
                }
                else{
                    min = mid+1;
                }
            }

            return ans;
    }
}