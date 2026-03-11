class Solution {
    public int numberOfSubstrings(String s) {
        // int n = s.length();
        // int ans = 0;
        // for(int i = 0; i < n; i++){
        //     int ch[] = new int[3];
        //     for(int j = i; j < n; j++){
        //         char c = s.charAt(j);
        //         ch[c - 'a']++;
        //         if(ch[0] >= 1 && ch[1] >=1 && ch[2] >= 1){
        //            ans+=(n-j);
        //            break;
        //         }
        //     }
        // }

        // return ans;

        // Approac 2;

        int i = 0;
        int j = 0;
        int ans = 0;
        int n = s.length();
        int ch[] = new int[3];

        while(j < n){
            char c = s.charAt(j);
            ch[c - 'a']++;

            while(ch[0] >= 1 && ch[1] >= 1 && ch[2] >= 1){
                ans+=(n - j);
                ch[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }

        return ans;
    }
}