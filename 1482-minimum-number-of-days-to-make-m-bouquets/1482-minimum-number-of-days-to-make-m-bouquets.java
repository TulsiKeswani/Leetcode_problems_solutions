class Solution {
    public boolean isPossible(int arr[],int mid,int m, int k){
        int i =0;
        int j = 0;

        while(j < arr.length){
            if(arr[j] > mid){
                i = j + 1;
            }
            else if(j - i + 1 == k){
                    i = j + 1;
                    m--;
            }

            if(m == 0) return true;
            j++;
        }

        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m * k) return -1;
        int low = Integer.MAX_VALUE;  // minimum possible days;
        int high = 0;   // max possible days to make bukets
        int ans = -1;

        // find low and high
        for(int i = 0; i < n; i++){
            low = Math.min(low,bloomDay[i]);
            high = Math.max(high,bloomDay[i]);
        }
        
       
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(bloomDay,mid,m, k)){
                ans = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }
}