class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        Stack<int[]> s = new Stack<>();

        s.push(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int prev[] = s.peek();
            if(intervals[i][0] <= prev[1]){
                s.pop();
                s.push(new int[]{prev[0],Math.max(prev[1],intervals[i][1])});
            }
            else{
                s.push(intervals[i]);
            }
        }

        int ans[][] = new int[s.size()][2];
        int i = 0;
        for(int a[] : s){
            ans[i] = a;
            i++;
        }
        return ans;
    }
}