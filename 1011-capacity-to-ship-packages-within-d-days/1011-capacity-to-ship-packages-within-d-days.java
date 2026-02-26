class Solution {
    public boolean isTransferred(int arr[],int day,int m){
        int capacity = 0;
        int n = arr.length;
        int d = 0;
        for(int i = 0; i < n; i++){
            if(capacity + arr[i] > m){
                d++;
                capacity = arr[i];
                
            }
            else{
                capacity += arr[i];
            }
        }

        return d+1 <= day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int high = 0;
        int low = -1;
        int ans = -1;
        for(int i = 0; i < weights.length; i++){
            low = Math.max(low,weights[i]);
            high+=weights[i];
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isTransferred(weights,days,mid)){
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}