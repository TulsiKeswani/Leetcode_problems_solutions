class Solution {
    public int maxDistance(String moves) {
        int xDis = 0;
        int yDis = 0;
        int blankCount = 0;
        for(int i = 0; i < moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                yDis++;
            }
            else if(ch == 'D'){
                yDis--;
            }
            else if(ch == 'L'){
                xDis--;
            }
            else if(ch == 'R'){
                xDis++;
            }
            else{
                blankCount++;
            }
        }

        return Math.abs(xDis) + Math.abs(yDis) + blankCount;
    }
}