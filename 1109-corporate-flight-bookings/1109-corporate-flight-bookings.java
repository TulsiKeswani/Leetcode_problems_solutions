class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];

        int diffArr[] = new int[n];

        for(int i = 0; i < bookings.length; i++){
            int k = bookings[i][0]-1;
            int j = bookings[i][1]-1;

            int seats = bookings[i][2];
            diffArr[k]+=seats;
            if(j != n-1) diffArr[j+1]-=seats;
        }

        for(int i = 1; i < diffArr.length; i++){
            diffArr[i] += diffArr[i-1];
        }

        return diffArr;
    }
}