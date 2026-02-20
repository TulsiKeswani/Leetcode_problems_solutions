class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumeven = 0;
        int sumodd = 0;
        for(int i = 1; i <= n * 2; i++){
            if(i % 2 == 0){
                sumeven+=i;
            }
            else{
                sumodd+=i;
            }
        }
        int min = Math.min(sumeven,sumodd);
        int gcd = 1;
        for(int i = 2; i <= min; i++){
            while(sumeven % i == 0 && sumodd % i == 0){
                System.out.println(sumeven + "  " + sumodd + "  " + i);
                gcd*=i;
                sumeven/=i;
                sumodd/=i;
            }
        }

        return gcd;
    }
}