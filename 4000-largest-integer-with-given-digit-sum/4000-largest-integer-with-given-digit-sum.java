class Solution {
    public int largestInteger(int n, int s) {
        
        for(int i = (int)Math.pow(10,n)-1; i >= 0; i--){
            int sum = 0;
            int temp = i;
            while(temp != 0){
                sum += (temp % 10);
                temp /= 10;
            }
            if(sum == s) return i;
        }

        return -1;
    }
}