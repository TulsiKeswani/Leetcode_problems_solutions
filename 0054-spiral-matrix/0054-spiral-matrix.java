class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rowst = 0;
        int colst = 0;
        int rowend = matrix.length - 1;
        int colend = matrix[0].length - 1;

        while(rowst <= rowend && colst <= colend){
            for(int j = colst; j <= colend; j++){
                ans.add(matrix[rowst][j]);
            }

            rowst++;

            for(int i = rowst; i <= rowend; i++){
                ans.add(matrix[i][colend]);
            }

            colend--;

            for(int j = colend; j >= colst; j--){
                if(rowst > rowend) break;
                ans.add(matrix[rowend][j]);
            }

            rowend--;

            for(int i = rowend; i >= rowst; i--){
                if(colst > colend) break;
                ans.add(matrix[i][colst]);
            }
            colst++;
        }

        return ans;
    }
}