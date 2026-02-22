class Solution {
   
    public boolean isDigitorialPermutation(int n) {
        int fact[] = new int[10];
        fact[0] = 1;
        int sum = 0;
        int temp = n;
        
        for(int i = 1; i < fact.length; i++){
            fact[i] = fact[i-1] * i;
        }
        
        while(n != 0){
            int ld = n % 10;
            sum+=fact[ld];
            n/=10;
        }
        char ch1[] = (sum+"").toCharArray();
        char ch2[] = (temp+"").toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1,ch2);
    }
}