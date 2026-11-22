class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length; i++){
            boolean track[] = new boolean[9];
            for(int j = 0; j < board[i].length; j++){
                char ch = board[i][j];

                if(ch == '.') continue;
                int num = ch - '0';

                if(track[num-1]){
                    return false;
                }

                track[num-1] = true;
            }
        }

         for(int j = 0; j < board.length; j++){
            boolean track[] = new boolean[9];
            for(int i = 0; i < board.length; i++){
                char ch = board[i][j];

                if(ch == '.') continue;
                int num = ch - '0';

                if(track[num-1]){
                    return false;
                }

                track[num-1] = true;
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                boolean track[] = new boolean[9];

                for(int k = i * 3; k < i*3+3; k++){
                    for(int l = j * 3; l < j * 3 + 3; l++){
                        char ch = board[k][l];

                        if(ch == '.') continue;
                        int num = ch - '0';

                        if(track[num-1]) return false;

                        track[num-1] = true;
                    }
                }
            }
        }

        return true;
    }
}