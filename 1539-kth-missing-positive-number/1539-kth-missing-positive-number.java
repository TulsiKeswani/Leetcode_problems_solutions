class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int miss = 0;
        // HashSet<Integer> s = new HashSet<>();
        // for(int i = 0; i < arr.length; i++){
        //     s.add(arr[i]);
        // }

        // int i = 1;
        // while(miss != k){
        //     if(!s.contains(i)){
        //         miss++;
        //     }

        //     i++;
        // }

        // return i-1;
        // int miss = 0;
        // for(int i = 0; i < arr.length; i++){
        //     miss = (arr[i] - (i + 1));

        //     if(miss >= k){
        //         return arr[i] - (miss - (k - 1));
        //     }
        // }

        // return arr[arr.length-1] + (k - miss);

        int st = 0;
        int n = arr.length-1;
        int end = n;
        int idx = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            int missing = arr[mid] - (mid + 1);

            if(missing < k){
                st = mid + 1;
            }
            else{
                idx = mid;
                end = mid-1;
            }
        }
         
        return idx == -1 ? 
        arr[n] + (k - (arr[n] - (n + 1))) :
        arr[idx] - ((arr[idx] - (idx + 1)) - (k - 1));
    }
}