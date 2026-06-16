class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        
        if(sx == tx && sy == ty) return true;

        while(tx >= sx && ty >= sy){

            if(tx == sx){
                return (ty-sy) % tx == 0;
            }

            if(sy == ty) return (tx-sx) % sy == 0;

            if(tx < ty){
                ty = ty % tx;
            }
            else{
                tx = tx % ty ;
            }

        }

        return false;
    }
}