class Solution {
    public void wiggleSort(int[] nums) {
        int temp[] = nums.clone();
        Arrays.sort(temp);
        int n = temp.length;

        int i = 0;
        int curr = (n-1)/ 2;
        while(i < n){
            nums[i] = temp[curr];
            curr--;
            i+=2;
        }
        i = 1;
        curr = n-1;

        while(i < n){
            nums[i] = temp[curr];
            i+=2;
            curr--;
        }
    }
}