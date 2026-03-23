class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        int n = nums1.length;
        boolean allOdd = true;
        boolean allEven = true;
       for(int i = 0; i < n; i++){
           if(nums1[i] % 2 == 0){
               minEven = Math.min(minEven,nums1[i]);
               allOdd = false;
           }
           else{
               minOdd = Math.min(minOdd,nums1[i]);
               allEven = false;
           }
       }


        return allOdd || allEven || minEven > minOdd;
    }
}