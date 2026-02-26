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
        int maxDays = 0;   // max possible days to make bukets
        for(int i = 0; i < n; i++){
            maxDays = Math.max(maxDays,bloomDay[i]);
        }
        System.out.println(maxDays);
        int low = 1;
        int high = maxDays;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            System.out.println(mid);
            if(isPossible(bloomDay,mid,m, k)){
                ans = mid;
                System.out.println(mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }
}