class Solution {
    public int findKthPositive(int[] arr, int k) {
        int miss = 0;
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            s.add(arr[i]);
        }

        int i = 1;
        while(miss != k){
            if(!s.contains(i)){
                miss++;
            }

            i++;
        }

        return i-1;
    }
}