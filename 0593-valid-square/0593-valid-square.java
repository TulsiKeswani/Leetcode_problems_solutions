class Solution {

    public int calcDistance(int a[], int b[]){
        return (int)(Math.pow(a[0] - b[0],2) + Math.pow(a[1] - b[1],2));
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int dis[] = {calcDistance(p1,p2),calcDistance(p2,p3),calcDistance(p3,p4),
        calcDistance(p1,p3),calcDistance(p2,p4),calcDistance(p1,p4)};
        Arrays.sort(dis);
        return (dis[0] > 0 && dis[0] == dis[1] && dis[1] == dis[2] && dis[2] == dis[3] && dis[4] == dis[5] && dis[5] > dis[0]);
    }
}