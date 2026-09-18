class Solution {
    public boolean isPossible(int arr[],int day,int m,int k){
        int n = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= day){
                n++;
            }
            else{
                n = 0;
            }
            if(n == k) {
                m--;
                n = 0;
            }

            if(m == 0) return true;
        }

        return m <= 0;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m * k > bloomDay.length) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i < bloomDay.length; i++){
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }
        int ans = -1;
        while(min <= max){
            int mid = min + (max - min)/2;

            if(isPossible(bloomDay,mid,m,k)){
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